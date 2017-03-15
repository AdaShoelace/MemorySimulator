package memory;

/**
 * This memory model allocates memory cells based on the buddy method.
 * 
 * @author "Johan Holmberg, Malmö university"
 * @since 1.0
 */
public class Buddy extends Memory {

	/**
	 * Initializes an instance of a buddy-based memory.
	 * 
	 * @param size The number of cells.
	 */
	public Buddy(int size) {
		super(size);
		// TODO Implement this!
	}

	/**
	 * Allocates a number of memory cells. 
	 * 
	 * @param size the number of cells to allocate.
	 * @return The address of the first cell.
	 */
	@Override
	public Pointer alloc(int size) {
		// TODO Implement this!
		return null;
	}
	
	/**
	 * Releases a number of data cells
	 * 
	 * @param p The pointer to release.
	 */
	@Override
	public void release(Pointer p) {
		// TODO Implement this!
	}
	
	/**
	 * Prints a simple model of the memory. Example:
	 * 
	 * |    0 -  110 | Allocated
	 * |  111 -  150 | Free
	 * |  151 -  999 | Allocated
	 * | 1000 - 1024 | Free
	 */
	@Override
	public void printLayout() {
		// TODO Implement this!
	}
}
