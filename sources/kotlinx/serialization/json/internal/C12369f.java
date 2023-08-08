package kotlinx.serialization.json.internal;

import androidx.compose.p004ui.graphics.vector.C15369g;
import kotlin.jvm.C11287e;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.json.internal.f */
public final class C12369f {
    @C12579k

    /* renamed from: a */
    public static final C12369f f30291a;
    @C12579k
    @C11287e

    /* renamed from: b */
    public static final char[] f30292b = new char[117];
    @C12579k
    @C11287e

    /* renamed from: c */
    public static final byte[] f30293c = new byte[126];

    static {
        C12369f fVar = new C12369f();
        f30291a = fVar;
        fVar.mo25498f();
        fVar.mo25497e();
    }

    /* renamed from: a */
    public final void mo25493a(char c, char c2) {
        mo25494b(c, c2);
    }

    /* renamed from: b */
    public final void mo25494b(int i, char c) {
        if (c != 'u') {
            f30292b[c] = (char) i;
        }
    }

    /* renamed from: c */
    public final void mo25495c(char c, byte b) {
        mo25496d(c, b);
    }

    /* renamed from: d */
    public final void mo25496d(int i, byte b) {
        f30293c[i] = b;
    }

    /* renamed from: e */
    public final void mo25497e() {
        for (int i = 0; i < 33; i++) {
            mo25496d(i, Byte.MAX_VALUE);
        }
        mo25496d(9, (byte) 3);
        mo25496d(10, (byte) 3);
        mo25496d(13, (byte) 3);
        mo25496d(32, (byte) 3);
        mo25495c(',', (byte) 4);
        mo25495c(C12361b.f30257h, (byte) 5);
        mo25495c(C12361b.f30258i, (byte) 6);
        mo25495c(C12361b.f30259j, (byte) 7);
        mo25495c(C12361b.f30260k, (byte) 8);
        mo25495c(C12361b.f30261l, (byte) 9);
        mo25495c('\"', (byte) 1);
        mo25495c('\\', (byte) 2);
    }

    /* renamed from: f */
    public final void mo25498f() {
        for (int i = 0; i < 32; i++) {
            mo25494b(i, C12361b.f30265p);
        }
        mo25494b(8, 'b');
        mo25494b(9, C15369g.f37991q);
        mo25494b(10, 'n');
        mo25494b(12, 'f');
        mo25494b(13, 'r');
        mo25493a('/', '/');
        mo25493a('\"', '\"');
        mo25493a('\\', '\\');
    }
}
