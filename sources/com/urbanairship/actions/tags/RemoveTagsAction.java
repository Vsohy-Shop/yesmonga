package com.urbanairship.actions.tags;

import androidx.annotation.C0359n0;
import com.urbanairship.C36059m;
import com.urbanairship.UAirship;
import com.urbanairship.actions.C35489b;
import com.urbanairship.actions.C35492e;
import com.urbanairship.actions.C35495f;
import com.urbanairship.channel.C9060z;
import java.util.Map;
import java.util.Set;

public class RemoveTagsAction extends C35514a {
    @C0359n0

    /* renamed from: k */
    public static final String f87575k = "remove_tags_action";
    @C0359n0

    /* renamed from: l */
    public static final String f87576l = "^-t";

    public static class RemoveTagsPredicate implements C35492e.C35494b {
        /* renamed from: a */
        public boolean mo106318a(@C0359n0 C35489b bVar) {
            return 1 != bVar.mo106348b();
        }
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo17301a(@C0359n0 C35489b bVar) {
        return super.mo17301a(bVar);
    }

    @C0359n0
    /* renamed from: d */
    public /* bridge */ /* synthetic */ C35495f mo17302d(@C0359n0 C35489b bVar) {
        return super.mo17302d(bVar);
    }

    /* renamed from: g */
    public void mo106390g(@C0359n0 Map<String, Set<String>> map) {
        C36059m.m148413i("RemoveTagsAction - Removing channel tag groups: %s", map);
        C9060z U = mo106393j().mo17788U();
        for (Map.Entry next : map.entrySet()) {
            U.mo17955g((String) next.getKey(), (Set) next.getValue());
        }
        U.mo17953d();
    }

    /* renamed from: h */
    public void mo106391h(@C0359n0 Set<String> set) {
        C36059m.m148413i("RemoveTagsAction - Removing tags: %s", set);
        mo106393j().mo17789V().mo17934g(set).mo17931c();
    }

    /* renamed from: i */
    public void mo106392i(@C0359n0 Map<String, Set<String>> map) {
        C36059m.m148413i("RemoveTagsAction - Removing named user tag groups: %s", map);
        C9060z X = UAirship.m146188Y().mo106227r().mo18031X();
        for (Map.Entry next : map.entrySet()) {
            X.mo17955g((String) next.getKey(), (Set) next.getValue());
        }
        X.mo17953d();
    }
}
