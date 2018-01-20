class InputPOSTagger {
  public static void main(String[] args) {
    try (InputStream modelIn = new FileInputStream("en-pos-maxent.bin"){
      POSModel model = new POSModel(modelIn);
    }
    
  }
}
