package memory;

/**
 * A simple class representing a pointer. It points to a specific address in
 * the memory space (see {@link RawMemory}). Using the pointer, the memory can
 * be read and written.
 * 
 * @author "Johan Holmberg, Malmö university"
 * @since 1.0
 */
public class Pointer {
	private int address;
	private RawMemory memory;
	
	/**
	 * Initializes an instance of Pointer.
	 */
	public Pointer(RawMemory memory) {
		this.memory = memory;
	}
	
	/**
	 * Initializes an instance of Pointer.
	 * 
	 * @param address The address to point at.
	 */
	public Pointer(int address, RawMemory memory) {
		this.memory = memory;
		if (address >= 0) {
			this.address = address;
		}
	}
	
	/**
	 * Points the pointer at a new address.
	 * 
	 * @param address The address to point at.
	 */
	public void pointAt(int address) {
		if (address >= 0) {
			this.address = address;
		}
	}
	
	/**
	 * Returns the address being pointed at.
	 * 
	 * @return The address.
	 */
	public int pointsAt() {
		return address;
	}
	
	/**
	 * Writes an array of data to the memory.
	 * 
	 * @param data The data to write.
	 */
	public void write(int[] data) {
		memory.write(address, data);
	}
	
	/**
	 * Reads from the memory.
	 * 
	 * @param length The number of bytes to read.
	 * 
	 * @return The data.
	 */
	public int[] read(int length) {
		return memory.read(address, length);
	}
}
