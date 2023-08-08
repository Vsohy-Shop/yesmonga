package com.urbanairship.android.layout.property;

import android.widget.ImageView;
import androidx.annotation.C0359n0;
import com.urbanairship.iam.C9168d0;
import com.urbanairship.json.JsonException;
import java.util.Locale;

public enum MediaFit {
    CENTER(C9168d0.f24881F0, ImageView.ScaleType.CENTER),
    CENTER_INSIDE("center_inside", ImageView.ScaleType.FIT_CENTER),
    CENTER_CROP("center_crop", ImageView.ScaleType.CENTER_CROP);
    
    @C0359n0
    private final ImageView.ScaleType scaleType;
    @C0359n0
    private final String value;

    /* access modifiers changed from: public */
    MediaFit(@C0359n0 String str, @C0359n0 ImageView.ScaleType scaleType2) {
        this.value = str;
        this.scaleType = scaleType2;
    }

    @C0359n0
    /* renamed from: b */
    public static ImageView.ScaleType m147677b(@C0359n0 String str) throws JsonException {
        return m147678g(str).mo107282q();
    }

    @C0359n0
    /* renamed from: g */
    public static MediaFit m147678g(@C0359n0 String str) throws JsonException {
        for (MediaFit mediaFit : values()) {
            if (mediaFit.value.equals(str.toLowerCase(Locale.ROOT))) {
                return mediaFit;
            }
        }
        throw new JsonException("Unknown MediaFit value: " + str);
    }

    @C0359n0
    /* renamed from: q */
    public ImageView.ScaleType mo107282q() {
        return this.scaleType;
    }

    @C0359n0
    public String toString() {
        return name().toLowerCase(Locale.ROOT);
    }
}
