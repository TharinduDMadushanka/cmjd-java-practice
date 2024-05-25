/**
 * Case 12
 * interface - interface ---> extends (we can do multiple extends with 2 interfaces)
 * interface - class ---> implements
 *
 */
package Day13_OOP5;
interface Lion{}
interface Fox extends Lion{}
interface Cat{}
interface Dog extends Lion, Cat{} // Legal

