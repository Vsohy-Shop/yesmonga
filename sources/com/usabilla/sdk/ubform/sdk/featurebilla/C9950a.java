package com.usabilla.sdk.ubform.sdk.featurebilla;

import com.usabilla.sdk.ubform.sdk.form.model.VariableName;
import java.util.Map;
import kotlin.C11078d1;
import kotlin.collections.C10975r0;
import kotlin.coroutines.C11045c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.usabilla.sdk.ubform.sdk.featurebilla.a */
public interface C9950a {

    /* renamed from: com.usabilla.sdk.ubform.sdk.featurebilla.a$a */
    public static final class C9951a {
        /* renamed from: a */
        public static /* synthetic */ Object m37528a(C9950a aVar, VariableName variableName, Object obj, Map map, C11045c cVar, int i, Object obj2) {
            if (obj2 == null) {
                if ((i & 4) != 0) {
                    map = C10975r0.m41401k(C11078d1.m42659a("platform", "android"));
                }
                return aVar.mo20806a(variableName, obj, map, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSettingVariable");
        }
    }

    @C12580l
    /* renamed from: a */
    <T> Object mo20806a(@C12579k VariableName variableName, T t, @C12579k Map<String, String> map, @C12579k C11045c<? super T> cVar);
}
