package org.chromium.support_lib_boundary;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface WebMessagePayloadBoundaryInterface extends FeatureFlagHolderBoundaryInterface {

    @Retention(RetentionPolicy.SOURCE)
    public @interface WebMessagePayloadType {
        public static final int TYPE_ARRAY_BUFFER = 1;
        public static final int TYPE_STRING = 0;
    }

    @C0359n0
    byte[] getAsArrayBuffer();

    @C0363p0
    String getAsString();

    int getType();
}
