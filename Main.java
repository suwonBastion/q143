class Main {
  public static void main(String[] args) {
    Plane2D[]a = {
      new Rectangle(2,5),
      new Parallels(2,5),
    };

    for (int i = 0; i<a.length;i++)
      System.out.println("a["+i+"]의면적="+a[i].getArea());
    
    
  }
}