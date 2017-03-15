package memory;

import java.util.LinkedList;

/**
 * This memory model allocates memory cells based on the first-fit method. 
 * 
 * @author "Johan Holmberg, Malmö university"
 * @since 1.0
 */
public class FirstFit extends Memory {


    private int firstFree = 0, nextFree = -1;

	/**
	 * Initializes an instance of a first fit-based memory.
	 * 
	 * @param size The number of cells.
	 */
	public FirstFit(int size) {
		super(size);
		cells[0] = cells.length;
	}

	/**
	 * Allocates a number of memory cells. 
	 * 
	 * @param size the number of cells to allocate.
	 * @return The address of the first cell.
	 */
	@Override
	public Pointer alloc(int size) {
		int current = firstFree;
		int prev = -1;
		boolean hasAlloc = false;
		Pointer retPtr;

		while(!hasAlloc){

			if(cells[current] > size){
				if(prev != -1){
					cells[prev] = cells[current + 1];
					cells[current] = size + 1;
					retPtr =  new Pointer(current + 1, this);
				} else {
					firstFree += size + 1;
					cells[current] = size + 1;
					retPtr = new Pointer(current + 1, this);
				}

			} else {
				current = cells[current + 1];
			}

			nextFree = cells[nextFree + 1];
		}

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
	
	/**
	 * Compacts the memory space.
	 */
	public void compact() {
		// TODO Implement this!
	}
}
