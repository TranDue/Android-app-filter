package trandue.thou.com.utils;

import android.Manifest;

/**
 * Created by Computer on 2/8/2018.
 */

public class PermissionUtils {
    public static final String Manifest_READ_EXTERNAL_STORAGE = Manifest.permission.READ_EXTERNAL_STORAGE;
    public static final String Manifest_WRITE_EXTERNAL_STORAGE = Manifest.permission.WRITE_EXTERNAL_STORAGE;
    public static final String Manifest_CAMERA = Manifest.permission.CAMERA;


    public interface PermissionResult{
        void permissionGranted();

        void permissionDenied();

        void permissionForeverDienid();
    }
}
