package androidx.compose.p004ui.text.input;

import androidx.compose.p004ui.text.C16261i;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C16261i
@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.text.input.d0 */
public final class C16285d0 {
    @C12579k

    /* renamed from: e */
    public static final C16286a f40470e = new C16286a((DefaultConstructorMarker) null);

    /* renamed from: f */
    public static final int f40471f = 8;

    /* renamed from: g */
    public static final int f40472g = 255;

    /* renamed from: h */
    public static final int f40473h = 64;

    /* renamed from: i */
    public static final int f40474i = -1;
    @C12579k

    /* renamed from: a */
    public String f40475a;
    @C12580l

    /* renamed from: b */
    public C16304m f40476b;

    /* renamed from: c */
    public int f40477c = -1;

    /* renamed from: d */
    public int f40478d = -1;

    /* renamed from: androidx.compose.ui.text.input.d0$a */
    public static final class C16286a {
        public /* synthetic */ C16286a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C16286a() {
        }
    }

    public C16285d0(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "text");
        this.f40475a = str;
    }

    /* renamed from: a */
    public final char mo47177a(int i) {
        C16304m mVar = this.f40476b;
        if (mVar == null) {
            return this.f40475a.charAt(i);
        }
        if (i < this.f40477c) {
            return this.f40475a.charAt(i);
        }
        int e = mVar.mo47229e();
        int i2 = this.f40477c;
        if (i < e + i2) {
            return mVar.mo47228d(i - i2);
        }
        return this.f40475a.charAt(i - ((e - this.f40478d) + i2));
    }

    /* renamed from: b */
    public final int mo47178b() {
        C16304m mVar = this.f40476b;
        if (mVar == null) {
            return this.f40475a.length();
        }
        return (this.f40475a.length() - (this.f40478d - this.f40477c)) + mVar.mo47229e();
    }

    @C12579k
    /* renamed from: c */
    public final String mo47179c() {
        return this.f40475a;
    }

    /* renamed from: d */
    public final void mo47180d(int i, int i2, @C12579k String str) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "text");
        boolean z2 = true;
        if (i <= i2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i < 0) {
                z2 = false;
            }
            if (z2) {
                C16304m mVar = this.f40476b;
                if (mVar == null) {
                    int max = Math.max(255, str.length() + 128);
                    char[] cArr = new char[max];
                    int min = Math.min(i, 64);
                    int min2 = Math.min(this.f40475a.length() - i2, 64);
                    int i3 = i - min;
                    C16308o.m73480a(this.f40475a, cArr, 0, i3, i);
                    int i4 = max - min2;
                    int i5 = min2 + i2;
                    C16308o.m73480a(this.f40475a, cArr, i4, i2, i5);
                    C16306n.m73479b(str, cArr, min);
                    this.f40476b = new C16304m(cArr, min + str.length(), i4);
                    this.f40477c = i3;
                    this.f40478d = i5;
                    return;
                }
                int i6 = this.f40477c;
                int i7 = i - i6;
                int i8 = i2 - i6;
                if (i7 < 0 || i8 > mVar.mo47229e()) {
                    this.f40475a = toString();
                    this.f40476b = null;
                    this.f40477c = -1;
                    this.f40478d = -1;
                    mo47180d(i, i2, str);
                    return;
                }
                mVar.mo47231g(i7, i8, str);
                return;
            }
            throw new IllegalArgumentException(("start must be non-negative, but was " + i).toString());
        }
        throw new IllegalArgumentException(("start index must be less than or equal to end index: " + i + " > " + i2).toString());
    }

    /* renamed from: e */
    public final void mo47181e(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f40475a = str;
    }

    @C12579k
    public String toString() {
        C16304m mVar = this.f40476b;
        if (mVar == null) {
            return this.f40475a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f40475a, 0, this.f40477c);
        mVar.mo47225a(sb);
        String str = this.f40475a;
        sb.append(str, this.f40478d, str.length());
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }
}
