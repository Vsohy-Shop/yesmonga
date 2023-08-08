package com.urbanairship.channel;

import androidx.arch.core.util.C0843a;
import com.urbanairship.C36071u;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.JsonValue;
import com.urbanairship.util.C9637a0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.urbanairship.channel.n */
public class C9034n extends C9637a0<List<C9025i>> {

    /* renamed from: com.urbanairship.channel.n$a */
    public class C9035a implements C0843a<List<C9025i>, C9333e> {
        /* renamed from: a */
        public C9333e apply(List<C9025i> list) {
            return JsonValue.m34975U(list);
        }
    }

    /* renamed from: com.urbanairship.channel.n$b */
    public class C9036b implements C0843a<JsonValue, List<C9025i>> {
        /* renamed from: a */
        public List<C9025i> apply(JsonValue jsonValue) {
            return C9025i.m33598b(jsonValue.mo18784z());
        }
    }

    /* renamed from: com.urbanairship.channel.n$c */
    public class C9037c implements C0843a<List<List<C9025i>>, List<List<C9025i>>> {
        public C9037c() {
        }

        /* renamed from: a */
        public List<List<C9025i>> apply(List<List<C9025i>> list) {
            ArrayList arrayList = new ArrayList();
            for (List<C9025i> addAll : list) {
                arrayList.addAll(addAll);
            }
            if (arrayList.isEmpty()) {
                return Collections.emptyList();
            }
            return Collections.singletonList(C9025i.m33597a(arrayList));
        }
    }

    public C9034n(C36071u uVar, String str) {
        super(uVar, str, new C9035a(), new C9036b());
    }

    /* renamed from: h */
    public void mo17884h() {
        mo19597c(new C9037c());
    }
}
