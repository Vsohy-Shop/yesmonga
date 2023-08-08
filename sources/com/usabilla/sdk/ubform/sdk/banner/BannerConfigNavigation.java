package com.usabilla.sdk.ubform.sdk.banner;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.view.C18124b2;
import com.carrefour.fid.android.shared.constant.C28539g;
import com.contentsquare.android.api.C14092c;
import com.squareup.moshi.C35390i;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.C9747c;
import java.util.Locale;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C35390i(generateAdapter = true)
@C11076d0(mo22515d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\b\u0018\u00002\u00020\u0001B}\b\u0007\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010&\u001a\u00020\u0007\u0012\b\b\u0002\u0010'\u001a\u00020\u0007\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\bO\u0010PJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0003J\u001a\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0003J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u000eHÂ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u000eHÂ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÂ\u0003J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0017\u0010\u0016J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0001\u0010*\u001a\u00020\u00002\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010&\u001a\u00020\u00072\b\b\u0002\u0010'\u001a\u00020\u00072\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b*\u0010+J\t\u0010,\u001a\u00020\u000eHÖ\u0001J\t\u0010-\u001a\u00020\u0007HÖ\u0001J\u0013\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u00102\u001a\u00020\u0007HÖ\u0001J\u0019\u00107\u001a\u0002062\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\u0007HÖ\u0001R\u0019\u0010 \u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0018\u00108\u001a\u0004\b9\u0010:R\u0019\u0010!\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u001f\u00108\u001a\u0004\b;\u0010:R\u0016\u0010\"\u001a\u0004\u0018\u00010\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u00108R\u0019\u0010#\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u00108\u001a\u0004\b<\u0010:R\u0019\u0010$\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u001a\u00108\u001a\u0004\b=\u0010:R\u0016\u0010%\u001a\u0004\u0018\u00010\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u00108R\u0014\u0010&\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010>R\u0017\u0010'\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b?\u0010>\u001a\u0004\b@\u0010AR\u0019\u0010(\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010\u001eR\u0019\u0010)\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b;\u0010C\u001a\u0004\bE\u0010\u001eR\u001a\u0010H\u001a\u00020\u00078\u0002XD¢\u0006\f\n\u0004\b@\u0010>\u0012\u0004\bF\u0010GR\"\u0010K\u001a\u0004\u0018\u00010\u000e8\u0000X\u0004¢\u0006\u0012\n\u0004\bD\u00108\u0012\u0004\bJ\u0010G\u001a\u0004\bI\u0010:R\"\u0010N\u001a\u0004\u0018\u00010\u000e8\u0000X\u0004¢\u0006\u0012\n\u0004\bL\u00108\u0012\u0004\bM\u0010G\u001a\u0004\b?\u0010:¨\u0006Q"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/banner/BannerConfigNavigation;", "Landroid/os/Parcelable;", "Landroid/graphics/drawable/Drawable;", "disabledDrawable", "enabledDrawable", "Landroid/graphics/drawable/StateListDrawable;", "C", "", "pressedColor", "backgroundDrawable", "Landroid/graphics/drawable/RippleDrawable;", "B", "Landroid/content/Context;", "context", "", "name", "m", "d", "g", "h", "Landroidx/appcompat/widget/AppCompatButton;", "t", "(Landroid/content/Context;)Landroidx/appcompat/widget/AppCompatButton;", "o", "a", "c", "e", "f", "i", "j", "()Ljava/lang/Integer;", "b", "continueButtonBgAssetName", "continueButtonTextColor", "continueButtonMessage", "cancelButtonBgAssetName", "cancelButtonTextColor", "cancelButtonMessage", "buttonCornerRadius", "marginBetween", "marginLeft", "marginRight", "k", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;)Lcom/usabilla/sdk/ubform/sdk/banner/BannerConfigNavigation;", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "u", "()Ljava/lang/String;", "x", "p", "s", "I", "v", "y", "()I", "w", "Ljava/lang/Integer;", "z", "A", "getAlphaDisabledButton$annotations", "()V", "alphaDisabledButton", "q", "getCancelButtonText$ubform_sdkRelease$annotations", "cancelButtonText", "X", "getContinueButtonText$ubform_sdkRelease$annotations", "continueButtonText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
@C12187d
public final class BannerConfigNavigation implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<BannerConfigNavigation> CREATOR = new C9914a();
    @C12580l

    /* renamed from: X */
    public final String f27240X;
    @C12580l

    /* renamed from: a */
    public final String f27241a;
    @C12580l

    /* renamed from: b */
    public final String f27242b;
    @C12580l

    /* renamed from: c */
    public final transient String f27243c;
    @C12580l

    /* renamed from: d */
    public final String f27244d;
    @C12580l

    /* renamed from: e */
    public final String f27245e;
    @C12580l

    /* renamed from: f */
    public final transient String f27246f;

    /* renamed from: g */
    public final transient int f27247g;

    /* renamed from: v */
    public final int f27248v;
    @C12580l

    /* renamed from: w */
    public final Integer f27249w;
    @C12580l

    /* renamed from: x */
    public final Integer f27250x;

    /* renamed from: y */
    public final transient int f27251y;
    @C12580l

    /* renamed from: z */
    public final String f27252z;

    /* renamed from: com.usabilla.sdk.ubform.sdk.banner.BannerConfigNavigation$a */
    public static final class C9914a implements Parcelable.Creator<BannerConfigNavigation> {
        @C12579k
        /* renamed from: a */
        public final BannerConfigNavigation createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BannerConfigNavigation(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @C12579k
        /* renamed from: b */
        public final BannerConfigNavigation[] newArray(int i) {
            return new BannerConfigNavigation[i];
        }
    }

    @C11315i
    public BannerConfigNavigation() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, (Integer) null, (Integer) null, 1023, (DefaultConstructorMarker) null);
    }

    /* renamed from: l */
    public static /* synthetic */ BannerConfigNavigation m37261l(BannerConfigNavigation bannerConfigNavigation, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, Integer num, Integer num2, int i3, Object obj) {
        BannerConfigNavigation bannerConfigNavigation2 = bannerConfigNavigation;
        int i4 = i3;
        return bannerConfigNavigation.mo20608k((i4 & 1) != 0 ? bannerConfigNavigation2.f27241a : str, (i4 & 2) != 0 ? bannerConfigNavigation2.f27242b : str2, (i4 & 4) != 0 ? bannerConfigNavigation2.f27243c : str3, (i4 & 8) != 0 ? bannerConfigNavigation2.f27244d : str4, (i4 & 16) != 0 ? bannerConfigNavigation2.f27245e : str5, (i4 & 32) != 0 ? bannerConfigNavigation2.f27246f : str6, (i4 & 64) != 0 ? bannerConfigNavigation2.f27247g : i, (i4 & 128) != 0 ? bannerConfigNavigation2.f27248v : i2, (i4 & 256) != 0 ? bannerConfigNavigation2.f27249w : num, (i4 & 512) != 0 ? bannerConfigNavigation2.f27250x : num2);
    }

    /* renamed from: n */
    public static /* synthetic */ void m37262n() {
    }

    /* renamed from: r */
    public static /* synthetic */ void m37263r() {
    }

    /* renamed from: w */
    public static /* synthetic */ void m37264w() {
    }

    @C12580l
    /* renamed from: A */
    public final Integer mo20592A() {
        return this.f27250x;
    }

    @TargetApi(21)
    /* renamed from: B */
    public final RippleDrawable mo20593B(int i, Drawable drawable) {
        return new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{i}), drawable, (Drawable) null);
    }

    @TargetApi(21)
    /* renamed from: C */
    public final StateListDrawable mo20594C(Drawable drawable, Drawable drawable2) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842910}, drawable);
        stateListDrawable.addState(new int[]{16842910}, drawable2);
        return stateListDrawable;
    }

    @C12580l
    /* renamed from: a */
    public final String mo20595a() {
        return this.f27241a;
    }

    @C12580l
    /* renamed from: b */
    public final Integer mo20596b() {
        return this.f27250x;
    }

    @C12580l
    /* renamed from: c */
    public final String mo20597c() {
        return this.f27242b;
    }

    /* renamed from: d */
    public final String mo20598d() {
        return this.f27243c;
    }

    public int describeContents() {
        return 0;
    }

    @C12580l
    /* renamed from: e */
    public final String mo20600e() {
        return this.f27244d;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerConfigNavigation)) {
            return false;
        }
        BannerConfigNavigation bannerConfigNavigation = (BannerConfigNavigation) obj;
        return Intrinsics.areEqual((Object) this.f27241a, (Object) bannerConfigNavigation.f27241a) && Intrinsics.areEqual((Object) this.f27242b, (Object) bannerConfigNavigation.f27242b) && Intrinsics.areEqual((Object) this.f27243c, (Object) bannerConfigNavigation.f27243c) && Intrinsics.areEqual((Object) this.f27244d, (Object) bannerConfigNavigation.f27244d) && Intrinsics.areEqual((Object) this.f27245e, (Object) bannerConfigNavigation.f27245e) && Intrinsics.areEqual((Object) this.f27246f, (Object) bannerConfigNavigation.f27246f) && this.f27247g == bannerConfigNavigation.f27247g && this.f27248v == bannerConfigNavigation.f27248v && Intrinsics.areEqual((Object) this.f27249w, (Object) bannerConfigNavigation.f27249w) && Intrinsics.areEqual((Object) this.f27250x, (Object) bannerConfigNavigation.f27250x);
    }

    @C12580l
    /* renamed from: f */
    public final String mo20602f() {
        return this.f27245e;
    }

    /* renamed from: g */
    public final String mo20603g() {
        return this.f27246f;
    }

    /* renamed from: h */
    public final int mo20604h() {
        return this.f27247g;
    }

    public int hashCode() {
        String str = this.f27241a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f27242b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f27243c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f27244d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f27245e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f27246f;
        int hashCode6 = (((((hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31) + Integer.hashCode(this.f27247g)) * 31) + Integer.hashCode(this.f27248v)) * 31;
        Integer num = this.f27249w;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f27250x;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode7 + i;
    }

    /* renamed from: i */
    public final int mo20606i() {
        return this.f27248v;
    }

    @C12580l
    /* renamed from: j */
    public final Integer mo20607j() {
        return this.f27249w;
    }

    @C12579k
    /* renamed from: k */
    public final BannerConfigNavigation mo20608k(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6, int i, int i2, @C12580l Integer num, @C12580l Integer num2) {
        return new BannerConfigNavigation(str, str2, str3, str4, str5, str6, i, i2, num, num2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        kotlin.p010io.C11133b.m42950a(r3, r2);
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable mo20609m(android.content.Context r2, java.lang.String r3) {
        /*
            r1 = this;
            android.content.res.AssetManager r0 = r2.getAssets()
            java.io.InputStream r3 = r0.open(r3)
            android.content.res.Resources r2 = r2.getResources()     // Catch:{ all -> 0x0020 }
            androidx.core.graphics.drawable.p r2 = androidx.core.graphics.drawable.C17565q.m80515b(r2, r3)     // Catch:{ all -> 0x0020 }
            int r0 = r1.f27247g     // Catch:{ all -> 0x0020 }
            float r0 = (float) r0     // Catch:{ all -> 0x0020 }
            r2.mo51968m(r0)     // Catch:{ all -> 0x0020 }
            r0 = 0
            kotlin.p010io.C11133b.m42950a(r3, r0)
            java.lang.String r3 = "context.assets.open(name).use {\n            RoundedBitmapDrawableFactory.create(context.resources, it).apply {\n                cornerRadius = buttonCornerRadius.toFloat()\n            }\n        }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            return r2
        L_0x0020:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0022 }
        L_0x0022:
            r0 = move-exception
            kotlin.p010io.C11133b.m42950a(r3, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.sdk.banner.BannerConfigNavigation.mo20609m(android.content.Context, java.lang.String):android.graphics.drawable.Drawable");
    }

    @C12579k
    /* renamed from: o */
    public final AppCompatButton mo20610o(@C12579k Context context) {
        int i;
        RippleDrawable rippleDrawable;
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        AppCompatButton appCompatButton = new AppCompatButton(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int dimensionPixelSize = appCompatButton.getResources().getDimensionPixelSize(C9747c.C9754g.unity_banner_padding);
        int i2 = 0;
        appCompatButton.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        Integer z = mo20621z();
        if (z == null) {
            i = 0;
        } else {
            i = z.intValue();
        }
        layoutParams.setMarginStart(i);
        Integer A = mo20592A();
        if (A != null) {
            i2 = A.intValue();
        }
        layoutParams.setMarginEnd(i2);
        layoutParams.gravity = 1;
        C11079d2 d2Var = C11079d2.f28267a;
        appCompatButton.setLayoutParams(layoutParams);
        String p = mo20611p();
        String str = null;
        if (p != null) {
            Drawable m = mo20609m(context, p);
            m.setAlpha(this.f27251y);
            String s = mo20613s();
            if (s == null) {
                rippleDrawable = null;
            } else {
                rippleDrawable = mo20593B(Color.parseColor(s), mo20609m(context, p));
            }
            if (rippleDrawable == null) {
                rippleDrawable = mo20593B(appCompatButton.getCurrentTextColor(), mo20609m(context, p));
            }
            appCompatButton.setBackground(mo20594C(m, rippleDrawable));
        }
        String q = mo20612q();
        if (q != null) {
            str = q.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str, "(this as java.lang.Strin….toUpperCase(Locale.ROOT)");
        }
        appCompatButton.setText(str);
        appCompatButton.setSingleLine();
        appCompatButton.setEllipsize(TextUtils.TruncateAt.END);
        String s2 = mo20613s();
        if (s2 != null) {
            appCompatButton.setTextColor(Color.parseColor(s2));
        }
        return appCompatButton;
    }

    @C12580l
    /* renamed from: p */
    public final String mo20611p() {
        return this.f27244d;
    }

    @C12580l
    /* renamed from: q */
    public final String mo20612q() {
        return this.f27252z;
    }

    @C12580l
    /* renamed from: s */
    public final String mo20613s() {
        return this.f27245e;
    }

    @C12579k
    /* renamed from: t */
    public final AppCompatButton mo20614t(@C12579k Context context) {
        int i;
        RippleDrawable rippleDrawable;
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        AppCompatButton appCompatButton = new AppCompatButton(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int dimensionPixelSize = appCompatButton.getResources().getDimensionPixelSize(C9747c.C9754g.unity_banner_padding);
        int i2 = 0;
        appCompatButton.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        Integer z = mo20621z();
        if (z == null) {
            i = 0;
        } else {
            i = z.intValue();
        }
        layoutParams.setMarginStart(i);
        Integer A = mo20592A();
        if (A != null) {
            i2 = A.intValue();
        }
        layoutParams.setMarginEnd(i2);
        layoutParams.gravity = 1;
        C11079d2 d2Var = C11079d2.f28267a;
        appCompatButton.setLayoutParams(layoutParams);
        String u = mo20616u();
        String str = null;
        if (u != null) {
            Drawable m = mo20609m(context, u);
            m.setAlpha(this.f27251y);
            String x = mo20619x();
            if (x == null) {
                rippleDrawable = null;
            } else {
                rippleDrawable = mo20593B(Color.parseColor(x), mo20609m(context, u));
            }
            if (rippleDrawable == null) {
                rippleDrawable = mo20593B(appCompatButton.getCurrentTextColor(), mo20609m(context, u));
            }
            appCompatButton.setBackground(mo20594C(m, rippleDrawable));
        }
        String v = mo20617v();
        if (v != null) {
            str = v.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str, "(this as java.lang.Strin….toUpperCase(Locale.ROOT)");
        }
        appCompatButton.setText(str);
        appCompatButton.setSingleLine();
        appCompatButton.setEllipsize(TextUtils.TruncateAt.END);
        String x2 = mo20619x();
        if (x2 != null) {
            appCompatButton.setTextColor(Color.parseColor(x2));
        }
        return appCompatButton;
    }

    @C12579k
    public String toString() {
        return "BannerConfigNavigation(continueButtonBgAssetName=" + this.f27241a + ", continueButtonTextColor=" + this.f27242b + ", continueButtonMessage=" + this.f27243c + ", cancelButtonBgAssetName=" + this.f27244d + ", cancelButtonTextColor=" + this.f27245e + ", cancelButtonMessage=" + this.f27246f + ", buttonCornerRadius=" + this.f27247g + ", marginBetween=" + this.f27248v + ", marginLeft=" + this.f27249w + ", marginRight=" + this.f27250x + ')';
    }

    @C12580l
    /* renamed from: u */
    public final String mo20616u() {
        return this.f27241a;
    }

    @C12580l
    /* renamed from: v */
    public final String mo20617v() {
        return this.f27240X;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f27241a);
        parcel.writeString(this.f27242b);
        parcel.writeString(this.f27243c);
        parcel.writeString(this.f27244d);
        parcel.writeString(this.f27245e);
        parcel.writeString(this.f27246f);
        parcel.writeInt(this.f27247g);
        parcel.writeInt(this.f27248v);
        Integer num = this.f27249w;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.f27250x;
        if (num2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(num2.intValue());
    }

    @C12580l
    /* renamed from: x */
    public final String mo20619x() {
        return this.f27242b;
    }

    /* renamed from: y */
    public final int mo20620y() {
        return this.f27248v;
    }

    @C12580l
    /* renamed from: z */
    public final Integer mo20621z() {
        return this.f27249w;
    }

    @C11315i
    public BannerConfigNavigation(@C12580l String str) {
        this(str, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, (Integer) null, (Integer) null, 1022, (DefaultConstructorMarker) null);
    }

    @C11315i
    public BannerConfigNavigation(@C12580l String str, @C12580l String str2) {
        this(str, str2, (String) null, (String) null, (String) null, (String) null, 0, 0, (Integer) null, (Integer) null, C18124b2.f46743v, (DefaultConstructorMarker) null);
    }

    @C11315i
    public BannerConfigNavigation(@C12580l String str, @C12580l String str2, @C12580l String str3) {
        this(str, str2, str3, (String) null, (String) null, (String) null, 0, 0, (Integer) null, (Integer) null, C18124b2.f46739r, (DefaultConstructorMarker) null);
    }

    @C11315i
    public BannerConfigNavigation(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4) {
        this(str, str2, str3, str4, (String) null, (String) null, 0, 0, (Integer) null, (Integer) null, C18124b2.f46731j, (DefaultConstructorMarker) null);
    }

    @C11315i
    public BannerConfigNavigation(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5) {
        this(str, str2, str3, str4, str5, (String) null, 0, 0, (Integer) null, (Integer) null, C28539g.f69231G, (DefaultConstructorMarker) null);
    }

    @C11315i
    public BannerConfigNavigation(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6) {
        this(str, str2, str3, str4, str5, str6, 0, 0, (Integer) null, (Integer) null, C14092c.f34671x0, (DefaultConstructorMarker) null);
    }

    @C11315i
    public BannerConfigNavigation(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6, int i) {
        this(str, str2, str3, str4, str5, str6, i, 0, (Integer) null, (Integer) null, 896, (DefaultConstructorMarker) null);
    }

    @C11315i
    public BannerConfigNavigation(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6, int i, int i2) {
        this(str, str2, str3, str4, str5, str6, i, i2, (Integer) null, (Integer) null, 768, (DefaultConstructorMarker) null);
    }

    @C11315i
    public BannerConfigNavigation(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6, int i, int i2, @C12580l Integer num) {
        this(str, str2, str3, str4, str5, str6, i, i2, num, (Integer) null, 512, (DefaultConstructorMarker) null);
    }

    @C11315i
    public BannerConfigNavigation(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6, int i, int i2, @C12580l Integer num, @C12580l Integer num2) {
        this.f27241a = str;
        this.f27242b = str2;
        this.f27243c = str3;
        this.f27244d = str4;
        this.f27245e = str5;
        this.f27246f = str6;
        this.f27247g = i;
        this.f27248v = i2;
        this.f27249w = num;
        this.f27250x = num2;
        this.f27251y = 70;
        this.f27252z = str6;
        this.f27240X = str3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BannerConfigNavigation(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, int r18, int r19, java.lang.Integer r20, java.lang.Integer r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r12
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r13
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r14
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r15
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0027
        L_0x0025:
            r6 = r16
        L_0x0027:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002d
            r7 = r2
            goto L_0x002f
        L_0x002d:
            r7 = r17
        L_0x002f:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0036
            r8 = 80
            goto L_0x0038
        L_0x0036:
            r8 = r18
        L_0x0038:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003f
            r9 = 20
            goto L_0x0041
        L_0x003f:
            r9 = r19
        L_0x0041:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0047
            r10 = r2
            goto L_0x0049
        L_0x0047:
            r10 = r20
        L_0x0049:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            r2 = r21
        L_0x0050:
            r12 = r11
            r13 = r1
            r14 = r3
            r15 = r4
            r16 = r5
            r17 = r6
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r10
            r22 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.sdk.banner.BannerConfigNavigation.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.Integer, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
