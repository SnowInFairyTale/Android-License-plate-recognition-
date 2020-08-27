package pr.platerecognization;

import android.graphics.Bitmap;

import org.opencv.core.Mat;

public class PlateInfo {

    /**
     * 车牌号
     */
    public String plateName;

    /**
     * 车牌号图片
     */
    public Bitmap bitmap;

    public PlateInfo() {
    }

    public PlateInfo(String plateName, Bitmap bitmap) {
        this.plateName = plateName;
        this.bitmap = bitmap;
    }
}
