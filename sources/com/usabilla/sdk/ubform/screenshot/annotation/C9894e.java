package com.usabilla.sdk.ubform.screenshot.annotation;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.usabilla.sdk.ubform.Logger;
import com.usabilla.sdk.ubform.screenshot.UbImageSource;
import com.usabilla.sdk.ubform.screenshot.annotation.C9889b;
import com.usabilla.sdk.ubform.sdk.form.model.UbInternalTheme;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import com.usabilla.sdk.ubform.utils.behavior.C10114a;
import com.usabilla.sdk.ubform.utils.behavior.C10115b;
import com.usabilla.sdk.ubform.utils.ext.C10130d;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.usabilla.sdk.ubform.screenshot.annotation.e */
public final class C9894e implements C9889b.C9890a {
    @C12579k

    /* renamed from: a */
    public Uri f27151a;
    @C12579k

    /* renamed from: b */
    public final UbImageSource f27152b;
    @C12579k

    /* renamed from: c */
    public final UbInternalTheme f27153c;
    @C12580l

    /* renamed from: d */
    public C9889b.C9891b f27154d;

    /* renamed from: e */
    public boolean f27155e;

    /* renamed from: com.usabilla.sdk.ubform.screenshot.annotation.e$a */
    public /* synthetic */ class C9895a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UbImageSource.values().length];
            iArr[UbImageSource.GALLERY.ordinal()] = 1;
            iArr[UbImageSource.CAMERA.ordinal()] = 2;
            iArr[UbImageSource.SCREENSHOT.ordinal()] = 3;
            iArr[UbImageSource.DEFAULT.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C9894e(@C12579k Uri uri, @C12579k UbImageSource ubImageSource, @C12579k UbInternalTheme ubInternalTheme) {
        Intrinsics.checkNotNullParameter(uri, "mutableImageUri");
        Intrinsics.checkNotNullParameter(ubImageSource, "imageSource");
        Intrinsics.checkNotNullParameter(ubInternalTheme, C10108c.f27794S);
        this.f27151a = uri;
        this.f27152b = ubImageSource;
        this.f27153c = ubInternalTheme;
    }

    /* renamed from: K */
    public void mo20449K(boolean z) {
        this.f27155e = z;
    }

    /* renamed from: O */
    public void mo20466O() {
        this.f27154d = null;
    }

    /* renamed from: V */
    public void mo20450V(@C12579k Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f27151a = uri;
        mo20468f(uri);
    }

    /* renamed from: a0 */
    public boolean mo20451a0() {
        return this.f27155e;
    }

    /* renamed from: d */
    public void mo20465L(@C12579k C9889b.C9891b bVar) {
        Intrinsics.checkNotNullParameter(bVar, C40383c.f102945c);
        this.f27154d = bVar;
    }

    /* renamed from: f */
    public final void mo20468f(Uri uri) {
        try {
            C9889b.C9891b bVar = this.f27154d;
            if (bVar != null) {
                bVar.mo20385y(this.f27153c);
            }
            int i = C9895a.$EnumSwitchMapping$0[this.f27152b.ordinal()];
            if (i == 1) {
                C9889b.C9891b bVar2 = this.f27154d;
                if (bVar2 != null) {
                    bVar2.mo20373G(uri);
                }
            } else if (i == 2) {
                C9889b.C9891b bVar3 = this.f27154d;
                if (bVar3 != null) {
                    bVar3.mo20379c0(uri);
                }
            } else if (i == 3) {
                C9889b.C9891b bVar4 = this.f27154d;
                if (bVar4 != null) {
                    bVar4.mo20380n(uri);
                }
            } else if (i == 4) {
                Logger.f26647a.logInfo("Error showing image");
            }
        } catch (Exception e) {
            Logger.f26647a.logError(Intrinsics.stringPlus("Loading screenshot failed: ", e.getLocalizedMessage()));
        }
    }

    /* renamed from: n */
    public void mo20452n(@C12579k File file, @C12579k Bitmap bitmap, @C12579k C10114a aVar) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(aVar, "behaviorBuilder");
        aVar.mo21558a(C10115b.C10116a.f27831c, this.f27152b.mo20359q()).mo21559b();
        C10130d.m38334d(bitmap, file);
        C9889b.C9891b bVar = this.f27154d;
        if (bVar != null) {
            Uri fromFile = Uri.fromFile(file);
            Intrinsics.checkNotNullExpressionValue(fromFile, "fromFile(file)");
            bVar.mo20384w0(fromFile);
        }
    }

    /* renamed from: u */
    public void mo20469u() {
        C9889b.C9891b bVar = this.f27154d;
        if (bVar != null) {
            bVar.mo20376Q();
            bVar.mo20383s0(this.f27153c.getColors().getCard());
        }
        mo20468f(this.f27151a);
    }

    @C12579k
    /* renamed from: x */
    public Uri mo20453x() {
        return this.f27151a;
    }
}
