package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.C1447e1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: androidx.camera.core.internal.compat.quirk.e */
public class C1603e implements C1447e1 {

    /* renamed from: a */
    public static final List<String> f4535a = new ArrayList(Arrays.asList(new String[]{"a5y17lte", "tb-8704x", "a7y17lte", "on7xelte", "heroqltevzw", "1816", "1814", "1815", "santoni", "htc_oclul", "asus_z01h_1", "vox_alpha_plus", "a5y17ltecan", "x304l", "hero2qltevzw", "a5y17lteskt", "1801", "a5y17lteskt", "1801", "a5y17ltelgt", "herolte", "htc_hiau_ml_tuhl", "a6plte", "hwtrt-q", "co2_sprout", "h3223", "davinci", "vince", "armor_x5", "a2corelte", "j6lte"}));

    /* renamed from: a */
    public static boolean m6630a() {
        return f4535a.contains(Build.DEVICE.toLowerCase(Locale.getDefault()));
    }
}
