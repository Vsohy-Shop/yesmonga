package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.room.C20305f;
import androidx.room.C20351p;
import androidx.room.C20396v;
import androidx.room.Index;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C20351p(foreignKeys = {@C20396v(childColumns = {"work_spec_id"}, entity = C21249u.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"}), @C20396v(childColumns = {"prerequisite_id"}, entity = C21249u.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})}, indices = {@Index({"work_spec_id"}), @Index({"prerequisite_id"})}, primaryKeys = {"work_spec_id", "prerequisite_id"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.model.a */
public final class C21207a {
    @C20305f(name = "work_spec_id")
    @C12579k

    /* renamed from: a */
    public final String f54732a;
    @C20305f(name = "prerequisite_id")
    @C12579k

    /* renamed from: b */
    public final String f54733b;

    public C21207a(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "workSpecId");
        Intrinsics.checkNotNullParameter(str2, "prerequisiteId");
        this.f54732a = str;
        this.f54733b = str2;
    }

    @C12579k
    /* renamed from: a */
    public final String mo63381a() {
        return this.f54733b;
    }

    @C12579k
    /* renamed from: b */
    public final String mo63382b() {
        return this.f54732a;
    }
}
