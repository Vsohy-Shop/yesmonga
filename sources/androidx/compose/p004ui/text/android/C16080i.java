package androidx.compose.p004ui.text.android;

import java.text.CharacterIterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.text.android.i */
public final class C16080i implements CharacterIterator {
    @C12579k

    /* renamed from: a */
    public final CharSequence f39966a;

    /* renamed from: b */
    public final int f39967b;

    /* renamed from: c */
    public final int f39968c;

    /* renamed from: d */
    public int f39969d;

    public C16080i(@C12579k CharSequence charSequence, int i, int i2) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        this.f39966a = charSequence;
        this.f39967b = i;
        this.f39968c = i2;
        this.f39969d = i;
    }

    @C12579k
    public Object clone() {
        try {
            Object clone = super.clone();
            Intrinsics.checkNotNullExpressionValue(clone, "{\n            @Suppress(…  super.clone()\n        }");
            return clone;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public char current() {
        int i = this.f39969d;
        if (i == this.f39968c) {
            return 65535;
        }
        return this.f39966a.charAt(i);
    }

    public char first() {
        this.f39969d = this.f39967b;
        return current();
    }

    public int getBeginIndex() {
        return this.f39967b;
    }

    public int getEndIndex() {
        return this.f39968c;
    }

    public int getIndex() {
        return this.f39969d;
    }

    public char last() {
        int i = this.f39967b;
        int i2 = this.f39968c;
        if (i == i2) {
            this.f39969d = i2;
            return 65535;
        }
        int i3 = i2 - 1;
        this.f39969d = i3;
        return this.f39966a.charAt(i3);
    }

    public char next() {
        int i = this.f39969d + 1;
        this.f39969d = i;
        int i2 = this.f39968c;
        if (i < i2) {
            return this.f39966a.charAt(i);
        }
        this.f39969d = i2;
        return 65535;
    }

    public char previous() {
        int i = this.f39969d;
        if (i <= this.f39967b) {
            return 65535;
        }
        int i2 = i - 1;
        this.f39969d = i2;
        return this.f39966a.charAt(i2);
    }

    public char setIndex(int i) {
        int i2 = this.f39967b;
        boolean z = false;
        if (i <= this.f39968c && i2 <= i) {
            z = true;
        }
        if (z) {
            this.f39969d = i;
            return current();
        }
        throw new IllegalArgumentException("invalid position");
    }
}
