package androidx.compose.p004ui.text;

import java.util.List;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "", "<name for destructuring parameter 0>", "a", "(Ljava/util/List;)Ljava/lang/Integer;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.JvmAnnotatedString_jvmKt$transform$1 */
public final class JvmAnnotatedString_jvmKt$transform$1 extends Lambda implements C11300l<List<? extends Integer>, Integer> {
    final /* synthetic */ Map<Integer, Integer> $offsetMap;
    final /* synthetic */ Ref.ObjectRef<String> $resultStr;
    final /* synthetic */ C16156d $this_transform;
    final /* synthetic */ C11305q<String, Integer, Integer, String> $transform;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JvmAnnotatedString_jvmKt$transform$1(Ref.ObjectRef<String> objectRef, C11305q<? super String, ? super Integer, ? super Integer, String> qVar, C16156d dVar, Map<Integer, Integer> map) {
        super(1);
        this.$resultStr = objectRef;
        this.$transform = qVar;
        this.$this_transform = dVar;
        this.$offsetMap = map;
    }

    @C12580l
    /* renamed from: a */
    public final Integer invoke(@C12579k List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "<name for destructuring parameter 0>");
        int intValue = list.get(0).intValue();
        int intValue2 = list.get(1).intValue();
        Ref.ObjectRef<String> objectRef = this.$resultStr;
        objectRef.element = ((String) this.$resultStr.element) + this.$transform.invoke(this.$this_transform.mo46683j(), Integer.valueOf(intValue), Integer.valueOf(intValue2));
        return this.$offsetMap.put(Integer.valueOf(intValue2), Integer.valueOf(((String) this.$resultStr.element).length()));
    }
}
