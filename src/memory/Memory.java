package memory;

/**
 * Memory is a slightly more advanced memory model, with support for object
 * allocation and deallocation. Basically, this is a heap in spe. Write and
 * read from the memory using {@link Pointer}.
 * 
 * @author "Johan Holmberg, Malmö university"
 * @since 1.0
 */
public abstract class Memory extends RawMemory {

	/**
	 * Initializes an instance of Memory.
	 * 
	 * @param size The number of cells.
	 */
	public Memory(int size) {
		super(size);
	}
	
	/**
	 * Allocates a number of memory cells. 
	 * 
	 * @param size the number of cells to allocate.
	 * @return The address of the first cell.
	 */
	public abstract Pointer alloc(int size);
	
	/**
	 * Releases a number of data cells
	 * 
	 * @param p The pointer to release.
	 */
	public abstract void release(Pointer p);
	
	/**
	 * Prints a simple model of the memory. Example:
	 * 
	 * |    0 -  110 | Allocated
	 * |  111 -  150 | Free
	 * |  151 -  999 | Allocated
	 * | 1000 - 1024 | Free
	 */
	public abstract void printLayout();
}
