package androidx.compose.p004ui.text.font;

import kotlin.jvm.C11288f;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11288f
@C11363r0({"SMAP\nDeviceFontFamilyNameFont.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceFontFamilyNameFont.kt\nandroidx/compose/ui/text/font/DeviceFontFamilyName\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
/* renamed from: androidx.compose.ui.text.font.p */
public final class C16228p {
    @C12579k

    /* renamed from: a */
    public final String f40328a;

    public /* synthetic */ C16228p(String str) {
        this.f40328a = str;
    }

    /* renamed from: a */
    public static final /* synthetic */ C16228p m73123a(String str) {
        return new C16228p(str);
    }

    @C12579k
    /* renamed from: b */
    public static String m73124b(@C12579k String str) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "name");
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return str;
        }
        throw new IllegalArgumentException("name may not be empty".toString());
    }

    /* renamed from: c */
    public static boolean m73125c(String str, Object obj) {
        return (obj instanceof C16228p) && Intrinsics.areEqual((Object) str, (Object) ((C16228p) obj).mo46988h());
    }

    /* renamed from: d */
    public static final boolean m73126d(String str, String str2) {
        return Intrinsics.areEqual((Object) str, (Object) str2);
    }

    /* renamed from: f */
    public static int m73127f(String str) {
        return str.hashCode();
    }

    /* renamed from: g */
    public static String m73128g(String str) {
        return "DeviceFontFamilyName(name=" + str + ')';
    }

    @C12579k
    /* renamed from: e */
    public final String mo46986e() {
        return this.f40328a;
    }

    public boolean equals(Object obj) {
        return m73125c(this.f40328a, obj);
    }

    /* renamed from: h */
    public final /* synthetic */ String mo46988h() {
        return this.f40328a;
    }

    public int hashCode() {
        return m73127f(this.f40328a);
    }

    public String toString() {
        return m73128g(this.f40328a);
    }
}
