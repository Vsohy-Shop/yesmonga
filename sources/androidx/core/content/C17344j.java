package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.C0359n0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.core.util.C18001r;
import com.carrefour.fid.android.presentation.p035ui.account.consent.C22925d;

/* renamed from: androidx.core.content.j */
public final class C17344j {
    @SuppressLint({"ActionValue"})

    /* renamed from: a */
    public static final String f45611a = "android.intent.action.CREATE_REMINDER";

    /* renamed from: b */
    public static final String f45612b = "android.intent.extra.HTML_TEXT";

    /* renamed from: c */
    public static final String f45613c = "android.intent.extra.START_PLAYBACK";
    @SuppressLint({"ActionValue"})

    /* renamed from: d */
    public static final String f45614d = "android.intent.extra.TIME";

    /* renamed from: e */
    public static final String f45615e = "android.intent.category.LEANBACK_LAUNCHER";

    @C0376v0(15)
    /* renamed from: androidx.core.content.j$a */
    public static class C17345a {
        @C0373u
        /* renamed from: a */
        public static Intent m79785a(String str, String str2) {
            return Intent.makeMainSelectorActivity(str, str2);
        }
    }

    @C0359n0
    /* renamed from: a */
    public static Intent m79783a(@C0359n0 Context context, @C0359n0 String str) {
        if (C17486s0.m80256a(context.getPackageManager())) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 31) {
                return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts(C22925d.f58520a, str, (String) null));
            }
            Intent data = new Intent(C17486s0.f45790b).setData(Uri.fromParts(C22925d.f58520a, str, (String) null));
            if (i >= 30) {
                return data;
            }
            return data.setPackage((String) C18001r.m81775l(C17486s0.m80257b(context.getPackageManager())));
        }
        throw new UnsupportedOperationException("Unused App Restriction features are not available on this device");
    }

    @C0359n0
    /* renamed from: b */
    public static Intent m79784b(@C0359n0 String str, @C0359n0 String str2) {
        return C17345a.m79785a(str, str2);
    }
}
