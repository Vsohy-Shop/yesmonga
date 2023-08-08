package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.room.C20305f;
import androidx.room.C20351p;
import androidx.room.C20396v;
import kotlin.jvm.C11287e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C20351p(foreignKeys = {@C20396v(childColumns = {"work_spec_id"}, entity = C21249u.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})}, primaryKeys = {"work_spec_id", "generation"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.model.i */
public final class C21229i {
    @C20305f(name = "work_spec_id")
    @C12579k
    @C11287e

    /* renamed from: a */
    public final String f54774a;
    @C20305f(defaultValue = "0")

    /* renamed from: b */
    public final int f54775b;
    @C20305f(name = "system_id")
    @C11287e

    /* renamed from: c */
    public final int f54776c;

    public C21229i(@C12579k String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "workSpecId");
        this.f54774a = str;
        this.f54775b = i;
        this.f54776c = i2;
    }

    /* renamed from: e */
    public static /* synthetic */ C21229i m98056e(C21229i iVar, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = iVar.f54774a;
        }
        if ((i3 & 2) != 0) {
            i = iVar.f54775b;
        }
        if ((i3 & 4) != 0) {
            i2 = iVar.f54776c;
        }
        return iVar.mo63419d(str, i, i2);
    }

    @C12579k
    /* renamed from: a */
    public final String mo63416a() {
        return this.f54774a;
    }

    /* renamed from: b */
    public final int mo63417b() {
        return this.f54775b;
    }

    /* renamed from: c */
    public final int mo63418c() {
        return this.f54776c;
    }

    @C12579k
    /* renamed from: d */
    public final C21229i mo63419d(@C12579k String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "workSpecId");
        return new C21229i(str, i, i2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21229i)) {
            return false;
        }
        C21229i iVar = (C21229i) obj;
        return Intrinsics.areEqual((Object) this.f54774a, (Object) iVar.f54774a) && this.f54775b == iVar.f54775b && this.f54776c == iVar.f54776c;
    }

    /* renamed from: f */
    public final int mo63421f() {
        return this.f54775b;
    }

    public int hashCode() {
        return (((this.f54774a.hashCode() * 31) + Integer.hashCode(this.f54775b)) * 31) + Integer.hashCode(this.f54776c);
    }

    @C12579k
    public String toString() {
        return "SystemIdInfo(workSpecId=" + this.f54774a + ", generation=" + this.f54775b + ", systemId=" + this.f54776c + ')';
    }
}
