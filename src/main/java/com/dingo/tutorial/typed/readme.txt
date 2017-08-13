A bean type defines a client-visible type of the bean. A bean may have multiple bean types. 

For example, the following bean has four bean types:
	public class BookShop
		extends Business
			implements Shop<Book> {
		...
	}
The bean types are BookShop, Business, Shop<Book> and Object.

We can restrict which bean types are valid for any given Java class with the @Typed annotation by providing a defined set of bean types that can be accepted.

For example, I can restrict the above bean to only Shop and the ambiguous resolution will be resolved.
	@Typed(Shop.class)
	public class BookShop
		extends Business
			implements Shop<Book> {
		...
	}



 