package androidx.compose.p004ui.input.key;

import android.view.KeyEvent;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11288f
/* renamed from: androidx.compose.ui.input.key.b */
public final class C15436b {
    @C12579k

    /* renamed from: a */
    public final KeyEvent f38418a;

    public /* synthetic */ C15436b(KeyEvent keyEvent) {
        this.f38418a = keyEvent;
    }

    /* renamed from: a */
    public static final /* synthetic */ C15436b m68252a(KeyEvent keyEvent) {
        return new C15436b(keyEvent);
    }

    @C12579k
    /* renamed from: b */
    public static KeyEvent m68253b(@C12579k KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "nativeKeyEvent");
        return keyEvent;
    }

    /* renamed from: c */
    public static boolean m68254c(KeyEvent keyEvent, Object obj) {
        return (obj instanceof C15436b) && Intrinsics.areEqual((Object) keyEvent, (Object) ((C15436b) obj).mo43922h());
    }

    /* renamed from: d */
    public static final boolean m68255d(KeyEvent keyEvent, KeyEvent keyEvent2) {
        return Intrinsics.areEqual((Object) keyEvent, (Object) keyEvent2);
    }

    /* renamed from: f */
    public static int m68256f(KeyEvent keyEvent) {
        return keyEvent.hashCode();
    }

    /* renamed from: g */
    public static String m68257g(KeyEvent keyEvent) {
        return "KeyEvent(nativeKeyEvent=" + keyEvent + ')';
    }

    @C12579k
    /* renamed from: e */
    public final KeyEvent mo43920e() {
        return this.f38418a;
    }

    public boolean equals(Object obj) {
        return m68254c(this.f38418a, obj);
    }

    /* renamed from: h */
    public final /* synthetic */ KeyEvent mo43922h() {
        return this.f38418a;
    }

    public int hashCode() {
        return m68256f(this.f38418a);
    }

    public String toString() {
        return m68257g(this.f38418a);
    }
}
