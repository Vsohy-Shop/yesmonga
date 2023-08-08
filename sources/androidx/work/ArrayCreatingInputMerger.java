package androidx.work;

import androidx.work.C21091d;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002J&\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0002J\u001e\u0010\u000f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0002¨\u0006\u0012"}, mo22516d2 = {"Landroidx/work/ArrayCreatingInputMerger;", "Landroidx/work/i;", "", "Landroidx/work/d;", "inputs", "b", "", "array1", "array2", "d", "array", "obj", "Ljava/lang/Class;", "valueClass", "c", "e", "<init>", "()V", "work-runtime_release"}, mo22517k = 1, mo22518mv = {1, 7, 1})
public final class ArrayCreatingInputMerger extends C21097i {
    @C12579k
    /* renamed from: b */
    public C21091d mo63033b(@C12579k List<C21091d> list) {
        Class cls;
        Intrinsics.checkNotNullParameter(list, "inputs");
        C21091d.C21092a aVar = new C21091d.C21092a();
        HashMap hashMap = new HashMap();
        for (C21091d x : list) {
            Map<String, Object> x2 = x.mo63169x();
            Intrinsics.checkNotNullExpressionValue(x2, "input.keyValueMap");
            Iterator<Map.Entry<String, Object>> it = x2.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Map.Entry next = it.next();
                    String str = (String) next.getKey();
                    Object value = next.getValue();
                    if (value != null) {
                        cls = value.getClass();
                    } else {
                        cls = String.class;
                    }
                    Object obj = hashMap.get(str);
                    Intrinsics.checkNotNullExpressionValue(str, "key");
                    if (obj != null) {
                        Class<?> cls2 = obj.getClass();
                        if (Intrinsics.areEqual((Object) cls2, (Object) cls)) {
                            Intrinsics.checkNotNullExpressionValue(value, "value");
                            value = mo63035d(obj, value);
                        } else if (Intrinsics.areEqual((Object) cls2.getComponentType(), (Object) cls)) {
                            value = mo63034c(obj, value, cls);
                        } else {
                            throw new IllegalArgumentException();
                        }
                    } else if (!cls.isArray()) {
                        value = mo63036e(value, cls);
                    }
                    Intrinsics.checkNotNullExpressionValue(value, "if (existingValue == nul…      }\n                }");
                    hashMap.put(str, value);
                }
            }
        }
        aVar.mo63175d(hashMap);
        C21091d a = aVar.mo63172a();
        Intrinsics.checkNotNullExpressionValue(a, "output.build()");
        return a;
    }

    /* renamed from: c */
    public final Object mo63034c(Object obj, Object obj2, Class<?> cls) {
        int length = Array.getLength(obj);
        Object newInstance = Array.newInstance(cls, length + 1);
        System.arraycopy(obj, 0, newInstance, 0, length);
        Array.set(newInstance, length, obj2);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newArray");
        return newInstance;
    }

    /* renamed from: d */
    public final Object mo63035d(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        int length2 = Array.getLength(obj2);
        Class<?> componentType = obj.getClass().getComponentType();
        Intrinsics.checkNotNull(componentType);
        Object newInstance = Array.newInstance(componentType, length + length2);
        System.arraycopy(obj, 0, newInstance, 0, length);
        System.arraycopy(obj2, 0, newInstance, length, length2);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newArray");
        return newInstance;
    }

    /* renamed from: e */
    public final Object mo63036e(Object obj, Class<?> cls) {
        Object newInstance = Array.newInstance(cls, 1);
        Array.set(newInstance, 0, obj);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newArray");
        return newInstance;
    }
}
