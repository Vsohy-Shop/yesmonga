package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.room.C20305f;
import androidx.room.C20351p;
import androidx.room.C20396v;
import androidx.room.Index;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C20351p(foreignKeys = {@C20396v(childColumns = {"work_spec_id"}, entity = C21249u.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})}, indices = {@Index({"work_spec_id"})}, primaryKeys = {"name", "work_spec_id"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.model.n */
public final class C21238n {
    @C20305f(name = "name")
    @C12579k

    /* renamed from: a */
    public final String f54786a;
    @C20305f(name = "work_spec_id")
    @C12579k

    /* renamed from: b */
    public final String f54787b;

    public C21238n(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "workSpecId");
        this.f54786a = str;
        this.f54787b = str2;
    }

    @C12579k
    /* renamed from: a */
    public final String mo63440a() {
        return this.f54786a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo63441b() {
        return this.f54787b;
    }
}
