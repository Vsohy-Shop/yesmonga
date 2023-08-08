package androidx.compose.runtime.saveable;

import java.util.List;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0002\u0010\b\u001a$\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00070\u0005\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\b\u0010\t"}, mo22516d2 = {"Landroidx/compose/runtime/saveable/f;", "Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;", "it", "", "", "", "", "", "a", "(Landroidx/compose/runtime/saveable/f;Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;)Ljava/util/Map;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SaveableStateHolderImpl$Companion$Saver$1 extends Lambda implements C11304p<C8629f, SaveableStateHolderImpl, Map<Object, Map<String, ? extends List<? extends Object>>>> {

    /* renamed from: f */
    public static final SaveableStateHolderImpl$Companion$Saver$1 f23097f = new SaveableStateHolderImpl$Companion$Saver$1();

    public SaveableStateHolderImpl$Companion$Saver$1() {
        super(2);
    }

    @C12580l
    /* renamed from: a */
    public final Map<Object, Map<String, List<Object>>> invoke(@C12579k C8629f fVar, @C12579k SaveableStateHolderImpl saveableStateHolderImpl) {
        Intrinsics.checkNotNullParameter(fVar, "$this$Saver");
        Intrinsics.checkNotNullParameter(saveableStateHolderImpl, "it");
        return saveableStateHolderImpl.mo16391h();
    }
}
