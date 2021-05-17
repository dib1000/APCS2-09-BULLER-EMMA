public class Kernel {
  float[][]kernel;

  /*Constructor takes the kernel that will be applied to the image
    This implementation only allows 3x3 kernels*/
  public Kernel(float[][]init) {
    kernel = new float[3][3];
    for(int i = 0; i < init.length; i++) {
      for(int j = 0; j < init[0].length; j++) {
        kernel[i][j] = init[i][j];
      }
    }
  }

  /*If part of the kernel is off of the image, return black, Otherwise
    Calculate the convolution of r/g/b separately, and return that color
  */
  color calcNewColor(PImage img, int x, int y) {
    if(x == 0 || x == img.width -1 || y == 0 || y == img.height -1) {
      return color(0);
    }
    else {
      return color(255);
    }
  }


  /*Assume the destination is the same dimensions as the source.

  */
  void apply(PImage source, PImage destination) {
    for(int w = 0 ; w < source.width; w++) {
      for(int h = 0; h < source.height; h++) {
        destination.set(w, h, calcNewColor(source,w,h));
      }
    }
  }

}
