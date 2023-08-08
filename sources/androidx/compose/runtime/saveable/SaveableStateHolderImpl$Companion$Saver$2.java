package androidx.compose.runtime.saveable;

import java.util.List;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo22516d2 = {"", "", "", "", "", "it", "Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;", "a", "(Ljava/util/Map;)Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SaveableStateHolderImpl$Companion$Saver$2 extends Lambda implements C11300l<Map<Object, Map<String, ? extends List<? extends Object>>>, SaveableStateHolderImpl> {

    /* renamed from: f */
    public static final SaveableStateHolderImpl$Companion$Saver$2 f23098f = new SaveableStateHolderImpl$Companion$Saver$2();

    public SaveableStateHolderImpl$Companion$Saver$2() {
        super(1);
    }

    @C12580l
    /* renamed from: a */
    public final SaveableStateHolderImpl invoke(@C12579k Map<Object, Map<String, List<Object>>> map) {
        Intrinsics.checkNotNullParameter(map, "it");
        return new SaveableStateHolderImpl(map);
    }
}
