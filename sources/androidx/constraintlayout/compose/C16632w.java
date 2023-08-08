package androidx.constraintlayout.compose;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.constraintlayout.compose.w */
public final class C16632w implements C16633x {

    /* renamed from: a */
    public float f41329a;
    @C12579k

    /* renamed from: b */
    public String f41330b;
    @C12579k

    /* renamed from: c */
    public String f41331c;

    /* renamed from: d */
    public float f41332d;

    /* renamed from: e */
    public boolean f41333e;

    /* renamed from: f */
    public float f41334f;

    /* renamed from: g */
    public float f41335g;

    public C16632w(float f, float f2, float f3, @C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "prefix");
        Intrinsics.checkNotNullParameter(str2, "postfix");
        this.f41329a = f3;
        this.f41330b = str;
        this.f41331c = str2;
        this.f41332d = f;
        this.f41334f = f;
        this.f41335g = f2;
    }

    @C12579k
    /* renamed from: a */
    public final ArrayList<String> mo48609a() {
        ArrayList<String> arrayList = new ArrayList<>();
        float f = this.f41334f;
        int i = (int) f;
        int i2 = (int) f;
        int i3 = (int) this.f41335g;
        if (i2 <= i3) {
            while (true) {
                int i4 = i2 + 1;
                arrayList.add(this.f41330b + i + this.f41331c);
                i += (int) this.f41329a;
                if (i2 == i3) {
                    break;
                }
                i2 = i4;
            }
        }
        return arrayList;
    }

    public float value() {
        float f = this.f41332d;
        if (f >= this.f41335g) {
            this.f41333e = true;
        }
        if (!this.f41333e) {
            this.f41332d = f + this.f41329a;
        }
        return this.f41332d;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16632w(float f, float f2, float f3, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, (i & 4) != 0 ? 1.0f : f3, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? "" : str2);
    }
}
