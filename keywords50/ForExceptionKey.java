package keywords50;

class ForExceptionKey {
	// String str;
	void Exceptionmethod() throws NullPointerException {

		// System.out.println(str.length());//throws keyword will execute by
		// throwing nullpointerexception class here
		System.out.println(
				"30.\tthrows keyword encountered with method name for upcoming NullPointerException in current method");

		for (int i = 1; i <= 2; i++) {
			try {
				if (i == 1) {
					System.out.println("31.\tthrow keyword...throwing NumberFormatException object");
					throw new NumberFormatException();

				} else {
					System.out.println("34.\tcontinue keyword...continuing loop");
					System.out.println("\t\tno exception caught while continuing");
					continue;
				}
			} catch (NumberFormatException ex) {
				System.out.println("32.\tcatch keyword...NumberFormatException caught successfully using catch block");
			} finally {
				System.out.println("33.\tfinally keyword...This will be always executed");
			}

		}

	}
}
