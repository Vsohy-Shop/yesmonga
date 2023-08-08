package androidx.compose.p004ui.text.input;

import kotlin.collections.C10956m;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nGapBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GapBuffer.kt\nandroidx/compose/ui/text/input/GapBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,338:1\n1#2:339\n*E\n"})
/* renamed from: androidx.compose.ui.text.input.m */
public final class C16304m {

    /* renamed from: a */
    public int f40498a;
    @C12579k

    /* renamed from: b */
    public char[] f40499b;

    /* renamed from: c */
    public int f40500c;

    /* renamed from: d */
    public int f40501d;

    public C16304m(@C12579k char[] cArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(cArr, "initBuffer");
        this.f40498a = cArr.length;
        this.f40499b = cArr;
        this.f40500c = i;
        this.f40501d = i2;
    }

    /* renamed from: a */
    public final void mo47225a(@C12579k StringBuilder sb) {
        Intrinsics.checkNotNullParameter(sb, "builder");
        sb.append(this.f40499b, 0, this.f40500c);
        char[] cArr = this.f40499b;
        int i = this.f40501d;
        sb.append(cArr, i, this.f40498a - i);
    }

    /* renamed from: b */
    public final void mo47226b(int i, int i2) {
        int i3 = this.f40500c;
        if (i < i3 && i2 <= i3) {
            int i4 = i3 - i2;
            char[] cArr = this.f40499b;
            C10956m.m41153X0(cArr, cArr, this.f40501d - i4, i2, i3);
            this.f40500c = i;
            this.f40501d -= i4;
        } else if (i >= i3 || i2 < i3) {
            int c = i + mo47227c();
            int c2 = i2 + mo47227c();
            int i5 = this.f40501d;
            char[] cArr2 = this.f40499b;
            C10956m.m41153X0(cArr2, cArr2, this.f40500c, i5, c);
            this.f40500c += c - i5;
            this.f40501d = c2;
        } else {
            this.f40501d = i2 + mo47227c();
            this.f40500c = i;
        }
    }

    /* renamed from: c */
    public final int mo47227c() {
        return this.f40501d - this.f40500c;
    }

    /* renamed from: d */
    public final char mo47228d(int i) {
        int i2 = this.f40500c;
        if (i < i2) {
            return this.f40499b[i];
        }
        return this.f40499b[(i - i2) + this.f40501d];
    }

    /* renamed from: e */
    public final int mo47229e() {
        return this.f40498a - mo47227c();
    }

    /* renamed from: f */
    public final void mo47230f(int i) {
        if (i > mo47227c()) {
            int c = i - mo47227c();
            int i2 = this.f40498a;
            do {
                i2 *= 2;
            } while (i2 - this.f40498a < c);
            char[] cArr = new char[i2];
            C10956m.m41153X0(this.f40499b, cArr, 0, 0, this.f40500c);
            int i3 = this.f40498a;
            int i4 = this.f40501d;
            int i5 = i3 - i4;
            int i6 = i2 - i5;
            C10956m.m41153X0(this.f40499b, cArr, i6, i4, i5 + i4);
            this.f40499b = cArr;
            this.f40498a = i2;
            this.f40501d = i6;
        }
    }

    /* renamed from: g */
    public final void mo47231g(int i, int i2, @C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "text");
        mo47230f(str.length() - (i2 - i));
        mo47226b(i, i2);
        C16306n.m73479b(str, this.f40499b, this.f40500c);
        this.f40500c += str.length();
    }

    @C12579k
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(sb);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply { append(this) }.toString()");
        return sb2;
    }
}
