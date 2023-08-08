package androidx.compose.material3;

import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.input.C16275a1;
import androidx.compose.p004ui.text.input.C16281c0;
import androidx.compose.p004ui.text.input.C16334z0;
import java.util.List;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nDateInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateVisualTransformation\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,358:1\n1183#2,3:359\n*S KotlinDebug\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateVisualTransformation\n*L\n339#1:359,3\n*E\n"})
/* renamed from: androidx.compose.material3.e0 */
public final class C8191e0 implements C16275a1 {
    @C12579k

    /* renamed from: b */
    public final C8169a0 f20105b;

    /* renamed from: c */
    public final int f20106c;

    /* renamed from: d */
    public final int f20107d;

    /* renamed from: e */
    public final int f20108e;
    @C12579k

    /* renamed from: f */
    public final C8192a f20109f = new C8192a(this);

    /* renamed from: androidx.compose.material3.e0$a */
    public static final class C8192a implements C16281c0 {

        /* renamed from: b */
        public final /* synthetic */ C8191e0 f20110b;

        public C8192a(C8191e0 e0Var) {
            this.f20110b = e0Var;
        }

        /* renamed from: a */
        public int mo9513a(int i) {
            if (i <= this.f20110b.f20106c - 1) {
                return i;
            }
            if (i <= this.f20110b.f20107d - 1) {
                return i - 1;
            }
            if (i <= this.f20110b.f20108e + 1) {
                return i - 2;
            }
            return this.f20110b.f20108e;
        }

        /* renamed from: b */
        public int mo9514b(int i) {
            if (i < this.f20110b.f20106c) {
                return i;
            }
            if (i < this.f20110b.f20107d) {
                return i + 1;
            }
            if (i > this.f20110b.f20108e) {
                i = this.f20110b.f20108e;
            }
            return i + 2;
        }
    }

    public C8191e0(@C12579k C8169a0 a0Var) {
        Intrinsics.checkNotNullParameter(a0Var, "dateInputFormat");
        this.f20105b = a0Var;
        this.f20106c = StringsKt__StringsKt.indexOf$default((CharSequence) a0Var.mo12437f(), a0Var.mo12435e(), 0, false, 6, (Object) null);
        this.f20107d = StringsKt__StringsKt.lastIndexOf$default((CharSequence) a0Var.mo12437f(), a0Var.mo12435e(), 0, false, 6, (Object) null);
        this.f20108e = a0Var.mo12438g().length();
    }

    @C12579k
    /* renamed from: a */
    public C16334z0 mo12556a(@C12579k C16156d dVar) {
        String str;
        Intrinsics.checkNotNullParameter(dVar, "text");
        int i = 0;
        if (dVar.mo46683j().length() > this.f20108e) {
            str = StringsKt__StringsKt.substring(dVar.mo46683j(), C11479u.m44378W1(0, this.f20108e));
        } else {
            str = dVar.mo46683j();
        }
        String str2 = "";
        int i2 = 0;
        while (i < str.length()) {
            int i3 = i2 + 1;
            String str3 = str2 + str.charAt(i);
            if (i3 == this.f20106c || i2 + 2 == this.f20107d) {
                str2 = str3 + this.f20105b.mo12435e();
            } else {
                str2 = str3;
            }
            i++;
            i2 = i3;
        }
        return new C16334z0(new C16156d(str2, (List) null, (List) null, 6, (DefaultConstructorMarker) null), this.f20109f);
    }
}
