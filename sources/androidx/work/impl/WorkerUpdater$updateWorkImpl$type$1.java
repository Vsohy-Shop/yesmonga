package androidx.work.impl;

import androidx.work.impl.model.C21249u;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/work/impl/model/u;", "spec", "", "a", "(Landroidx/work/impl/model/u;)Ljava/lang/String;"}, mo22517k = 3, mo22518mv = {1, 7, 1})
public final class WorkerUpdater$updateWorkImpl$type$1 extends Lambda implements C11300l<C21249u, String> {

    /* renamed from: f */
    public static final WorkerUpdater$updateWorkImpl$type$1 f54460f = new WorkerUpdater$updateWorkImpl$type$1();

    public WorkerUpdater$updateWorkImpl$type$1() {
        super(1);
    }

    @C12579k
    /* renamed from: a */
    public final String invoke(@C12579k C21249u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "spec");
        if (uVar.mo63456D()) {
            return "Periodic";
        }
        return "OneTime";
    }
}
