package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.C17455f;
import androidx.core.provider.C17866h;
import com.carrefour.fid.android.shared.constant.C28515a1;
import java.io.IOException;
import java.io.InputStream;

@C0376v0(29)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.core.graphics.g2 */
public class C17583g2 extends C17589h2 {
    /* renamed from: p */
    public static int m80552p(@C0359n0 FontStyle fontStyle, @C0359n0 FontStyle fontStyle2) {
        int i;
        int abs = Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100;
        if (fontStyle.getSlant() == fontStyle2.getSlant()) {
            i = 0;
        } else {
            i = 2;
        }
        return abs + i;
    }

    @C0363p0
    /* renamed from: b */
    public Typeface mo51926b(Context context, C17455f.C17459d dVar, Resources resources, int i) {
        int i2;
        try {
            FontFamily.Builder builder = null;
            for (C17455f.C17460e eVar : dVar.mo51887a()) {
                try {
                    C17640s1.m80757a();
                    Font.Builder a = C17629p1.m80724a(resources, eVar.mo51889b()).setWeight(eVar.mo51892e());
                    if (eVar.mo51893f()) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    Font a2 = a.setSlant(i2).setTtcIndex(eVar.mo51890c()).setFontVariationSettings(eVar.mo51891d()).build();
                    if (builder == null) {
                        C17643t1.m80760a();
                        builder = C17632q1.m80733a(a2);
                    } else {
                        FontFamily.Builder unused = builder.addFont(a2);
                    }
                } catch (IOException unused2) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily a3 = builder.build();
            C17637r1.m80751a();
            return C17626o1.m80721a(a3).setStyle(mo52033o(a3, i).getStyle()).build();
        } catch (Exception unused3) {
            return null;
        }
    }

    @C0363p0
    /* renamed from: d */
    public Typeface mo51927d(Context context, @C0363p0 CancellationSignal cancellationSignal, @C0359n0 C17866h.C17869c[] cVarArr, int i) {
        ParcelFileDescriptor openFileDescriptor;
        int i2;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (C17866h.C17869c cVar : cVarArr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(cVar.mo52285d(), C28515a1.f68703k, cancellationSignal);
                    if (openFileDescriptor != null) {
                        C17640s1.m80757a();
                        Font.Builder a = C17650v1.m80768a(openFileDescriptor).setWeight(cVar.mo52286e());
                        if (cVar.mo52287f()) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        Font a2 = a.setSlant(i2).setTtcIndex(cVar.mo52284c()).build();
                        if (builder == null) {
                            C17643t1.m80760a();
                            builder = C17632q1.m80733a(a2);
                        } else {
                            FontFamily.Builder unused = builder.addFont(a2);
                        }
                    } else if (openFileDescriptor == null) {
                    }
                    openFileDescriptor.close();
                } catch (IOException unused2) {
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily a3 = builder.build();
            C17637r1.m80751a();
            return C17626o1.m80721a(a3).setStyle(mo52033o(a3, i).getStyle()).build();
            throw th;
        } catch (Exception unused3) {
            return null;
        }
    }

    /* renamed from: e */
    public Typeface mo52030e(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @C0363p0
    /* renamed from: f */
    public Typeface mo52031f(Context context, Resources resources, int i, String str, int i2) {
        try {
            C17640s1.m80757a();
            Font a = C17629p1.m80724a(resources, i).build();
            C17643t1.m80760a();
            FontFamily a2 = C17632q1.m80733a(a).build();
            C17637r1.m80751a();
            return C17626o1.m80721a(a2).setStyle(a.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @C0359n0
    /* renamed from: g */
    public Typeface mo51928g(@C0359n0 Context context, @C0359n0 Typeface typeface, int i, boolean z) {
        return Typeface.create(typeface, i, z);
    }

    /* renamed from: l */
    public C17866h.C17869c mo52032l(C17866h.C17869c[] cVarArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    /* renamed from: o */
    public final Font mo52033o(@C0359n0 FontFamily fontFamily, int i) {
        int i2;
        int i3;
        C17656x1.m80790a();
        if ((i & 1) != 0) {
            i2 = 700;
        } else {
            i2 = 400;
        }
        if ((i & 2) != 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        FontStyle a = C17653w1.m80786a(i2, i3);
        Font a2 = fontFamily.getFont(0);
        int p = m80552p(a, a2.getStyle());
        for (int i4 = 1; i4 < fontFamily.getSize(); i4++) {
            Font a3 = fontFamily.getFont(i4);
            int p2 = m80552p(a, a3.getStyle());
            if (p2 < p) {
                a2 = a3;
                p = p2;
            }
        }
        return a2;
    }
}
