package memory;

/**
 * Simulates a memory space, made out of a number of memory cells. Each cell
 * holds an int value.
 * 
 * @author "Johan Holmberg, Malmö university"
 * @since 1.0
 */
class RawMemory {
	protected int[] cells;
	
	/**
	 * Initializes a memory instance.
	 * 
	 * @param size The number of cells in the memory.
	 */
	public RawMemory(int size) {
		if (size < 1) {
			size = 1;
		}
		cells = new int[size];
	}
	
	/**
	 * Writes a piece of data to the memory.
	 * 
	 * @param address The address to write to. 
	 * @param data The data to write.
	 */
	protected void write(int address, int[] data) {
		try {
			for (int i = 0; i < data.length; i++) {
				cells[address + i] = data[i];
			}
		} catch (ArrayIndexOutOfBoundsException e) {}
	}
	
	/**
	 * Reads a piece of data from the memory.
	 * 
	 * @param address The address to read from.
	 * @param length The number of cells to read.
	 * 
	 * @return The data.
	 */
	protected int[] read(int address, int length) {
		int[] data = new int[length];
		try {
			for (int i = 0; i < length; i++) {
				data[i] = cells[address + i];
			}
		} catch (ArrayIndexOutOfBoundsException e) {}
		
		return data;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		for (int data : cells) {
			sb.append(data + "\n");
		}
		
		return sb.toString();
	}
}
