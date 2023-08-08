package com.urbanairship.channel;

import androidx.annotation.C0359n0;
import androidx.arch.core.util.C0843a;
import com.urbanairship.C36071u;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.JsonValue;
import com.urbanairship.util.C9637a0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.urbanairship.channel.o */
public class C9038o extends C9637a0<List<C9051t>> {

    /* renamed from: com.urbanairship.channel.o$a */
    public class C9039a implements C0843a<List<C9051t>, C9333e> {
        /* renamed from: a */
        public C9333e apply(List<C9051t> list) {
            return JsonValue.m34975U(list);
        }
    }

    /* renamed from: com.urbanairship.channel.o$b */
    public class C9040b implements C0843a<JsonValue, List<C9051t>> {
        /* renamed from: a */
        public List<C9051t> apply(JsonValue jsonValue) {
            return C9051t.m33700c(jsonValue.mo18784z());
        }
    }

    /* renamed from: com.urbanairship.channel.o$c */
    public class C9041c implements C0843a<List<List<C9051t>>, List<List<C9051t>>> {
        public C9041c() {
        }

        /* renamed from: a */
        public List<List<C9051t>> apply(List<List<C9051t>> list) {
            ArrayList arrayList = new ArrayList();
            for (List<C9051t> addAll : list) {
                arrayList.addAll(addAll);
            }
            if (arrayList.isEmpty()) {
                return Collections.emptyList();
            }
            return Collections.singletonList(C9051t.m33699b(arrayList));
        }
    }

    public C9038o(@C0359n0 C36071u uVar, @C0359n0 String str) {
        super(uVar, str, new C9039a(), new C9040b());
    }

    /* renamed from: h */
    public void mo17888h() {
        mo19597c(new C9041c());
    }
}
