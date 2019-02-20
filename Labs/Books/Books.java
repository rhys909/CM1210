class Books {

  private String name;
  private String barcode;

  public Books( String bookName, String bookBarcode ) {
      name = bookName;
      barcode = bookBarcode;
  }

  public String getName( ) {
      return name;
  }

  public String getBarcode( ) {
      return barcode;
  }

  public void setBarcode( String bookBarcode ) {
      barcode = bookBarcode;
  }

  public String toString( ) {
      return name + "\t(" + barcode + ") ";
  }

  public boolean equals( Books bk ) {
      return name.equals( bk.name ) && number.equals( bk.barcode )
  }
}
