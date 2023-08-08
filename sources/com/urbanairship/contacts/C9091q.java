package com.urbanairship.contacts;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.channel.C9004a0;
import com.urbanairship.channel.C9025i;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.urbanairship.contacts.q */
public class C9091q implements C9333e {

    /* renamed from: c */
    public static final String f24549c = "UPDATE";

    /* renamed from: d */
    public static final String f24550d = "IDENTIFY";

    /* renamed from: e */
    public static final String f24551e = "RESOLVE";

    /* renamed from: f */
    public static final String f24552f = "RESET";

    /* renamed from: g */
    public static final String f24553g = "REGISTER_EMAIL";

    /* renamed from: v */
    public static final String f24554v = "REGISTER_SMS";

    /* renamed from: w */
    public static final String f24555w = "REGISTER_OPEN_CHANNEL";

    /* renamed from: x */
    public static final String f24556x = "ASSOCIATE_CHANNEL";

    /* renamed from: y */
    public static final String f24557y = "TYPE_KEY";

    /* renamed from: z */
    public static final String f24558z = "PAYLOAD_KEY";

    /* renamed from: a */
    public final String f24559a;

    /* renamed from: b */
    public final C9094c f24560b;

    /* renamed from: com.urbanairship.contacts.q$a */
    public static class C9092a implements C9094c {

        /* renamed from: c */
        public static final String f24561c = "CHANNEL_ID";

        /* renamed from: d */
        public static final String f24562d = "CHANNEL_TYPE";

        /* renamed from: a */
        public final String f24563a;

        /* renamed from: b */
        public final ChannelType f24564b;

        public C9092a(@C0359n0 String str, @C0359n0 ChannelType channelType) {
            this.f24563a = str;
            this.f24564b = channelType;
        }

        @C0359n0
        /* renamed from: a */
        public static C9092a m33935a(@C0359n0 JsonValue jsonValue) throws JsonException {
            String F = jsonValue.mo18749A().mo18801A(f24561c).mo18753F();
            String F2 = jsonValue.mo18749A().mo18801A(f24562d).mo18753F();
            try {
                return new C9092a(F, ChannelType.valueOf(F2));
            } catch (IllegalArgumentException e) {
                throw new JsonException("Invalid channel type " + F2, e);
            }
        }

        @C0359n0
        /* renamed from: b */
        public String mo18074b() {
            return this.f24563a;
        }

        @C0359n0
        /* renamed from: c */
        public ChannelType mo18075c() {
            return this.f24564b;
        }

        @C0359n0
        /* renamed from: q */
        public JsonValue mo17264q() {
            return C9323b.m35017y().mo18823g(f24561c, this.f24563a).mo18823g(f24562d, this.f24564b.name()).mo18817a().mo17264q();
        }
    }

    /* renamed from: com.urbanairship.contacts.q$b */
    public static class C9093b implements C9094c {

        /* renamed from: a */
        public final String f24565a;

        public C9093b(@C0359n0 String str) {
            this.f24565a = str;
        }

        @C0359n0
        /* renamed from: a */
        public static C9093b m33939a(@C0359n0 JsonValue jsonValue) throws JsonException {
            return new C9093b(jsonValue.mo18753F());
        }

        @C0359n0
        /* renamed from: b */
        public String mo18076b() {
            return this.f24565a;
        }

        @C0359n0
        /* renamed from: q */
        public JsonValue mo17264q() {
            return JsonValue.m34975U(this.f24565a);
        }

        public String toString() {
            return "IdentifyPayload{identifier='" + this.f24565a + '\'' + C12361b.f30259j;
        }
    }

    /* renamed from: com.urbanairship.contacts.q$c */
    public interface C9094c extends C9333e {
    }

    /* renamed from: com.urbanairship.contacts.q$d */
    public static class C9095d implements C9094c {

        /* renamed from: c */
        public static final String f24566c = "EMAIL_ADDRESS";

        /* renamed from: d */
        public static final String f24567d = "OPTIONS";

        /* renamed from: a */
        public final String f24568a;

        /* renamed from: b */
        public final C9099r f24569b;

        public C9095d(@C0359n0 String str, @C0359n0 C9099r rVar) {
            this.f24568a = str;
            this.f24569b = rVar;
        }

        @C0359n0
        /* renamed from: a */
        public static C9095d m33942a(@C0359n0 JsonValue jsonValue) throws JsonException {
            return new C9095d(jsonValue.mo18749A().mo18801A(f24566c).mo18753F(), C9099r.m33960b(jsonValue.mo18749A().mo18801A("OPTIONS")));
        }

        @C0359n0
        /* renamed from: b */
        public String mo18078b() {
            return this.f24568a;
        }

        @C0359n0
        /* renamed from: c */
        public C9099r mo18079c() {
            return this.f24569b;
        }

        @C0359n0
        /* renamed from: q */
        public JsonValue mo17264q() {
            return C9323b.m35017y().mo18823g(f24566c, this.f24568a).mo18822f("OPTIONS", this.f24569b).mo18817a().mo17264q();
        }
    }

    /* renamed from: com.urbanairship.contacts.q$e */
    public static class C9096e implements C9094c {

        /* renamed from: c */
        public static final String f24570c = "ADDRESS";

        /* renamed from: d */
        public static final String f24571d = "OPTIONS";

        /* renamed from: a */
        public final String f24572a;

        /* renamed from: b */
        public final C9100s f24573b;

        public C9096e(@C0359n0 String str, @C0359n0 C9100s sVar) {
            this.f24572a = str;
            this.f24573b = sVar;
        }

        @C0359n0
        /* renamed from: a */
        public static C9096e m33946a(@C0359n0 JsonValue jsonValue) throws JsonException {
            return new C9096e(jsonValue.mo18749A().mo18801A(f24570c).mo18753F(), C9100s.m33968a(jsonValue.mo18749A().mo18801A("OPTIONS")));
        }

        @C0359n0
        /* renamed from: b */
        public String mo18080b() {
            return this.f24572a;
        }

        @C0359n0
        /* renamed from: c */
        public C9100s mo18081c() {
            return this.f24573b;
        }

        @C0359n0
        /* renamed from: q */
        public JsonValue mo17264q() {
            return C9323b.m35017y().mo18823g(f24570c, this.f24572a).mo18822f("OPTIONS", this.f24573b).mo18817a().mo17264q();
        }
    }

    /* renamed from: com.urbanairship.contacts.q$f */
    public static class C9097f implements C9094c {

        /* renamed from: c */
        public static final String f24574c = "MSISDN";

        /* renamed from: d */
        public static final String f24575d = "OPTIONS";

        /* renamed from: a */
        public final String f24576a;

        /* renamed from: b */
        public final C9103v f24577b;

        public C9097f(@C0359n0 String str, @C0359n0 C9103v vVar) {
            this.f24576a = str;
            this.f24577b = vVar;
        }

        @C0359n0
        /* renamed from: a */
        public static C9097f m33950a(@C0359n0 JsonValue jsonValue) throws JsonException {
            return new C9097f(jsonValue.mo18749A().mo18801A(f24574c).mo18753F(), C9103v.m33992a(jsonValue.mo18749A().mo18801A("OPTIONS")));
        }

        /* renamed from: b */
        public String mo18082b() {
            return this.f24576a;
        }

        /* renamed from: c */
        public C9103v mo18083c() {
            return this.f24577b;
        }

        @C0359n0
        /* renamed from: q */
        public JsonValue mo17264q() {
            return C9323b.m35017y().mo18823g(f24574c, this.f24576a).mo18822f("OPTIONS", this.f24577b).mo18817a().mo17264q();
        }
    }

    /* renamed from: com.urbanairship.contacts.q$g */
    public static class C9098g implements C9094c {

        /* renamed from: d */
        public static final String f24578d = "TAG_GROUP_MUTATIONS_KEY";

        /* renamed from: e */
        public static final String f24579e = "ATTRIBUTE_MUTATIONS_KEY";

        /* renamed from: f */
        public static final String f24580f = "SUBSCRIPTION_LISTS_MUTATIONS_KEY";

        /* renamed from: a */
        public final List<C9004a0> f24581a;

        /* renamed from: b */
        public final List<C9025i> f24582b;

        /* renamed from: c */
        public final List<C9102u> f24583c;

        public C9098g(@C0363p0 List<C9004a0> list, @C0363p0 List<C9025i> list2, @C0363p0 List<C9102u> list3) {
            this.f24581a = list == null ? Collections.emptyList() : list;
            this.f24582b = list2 == null ? Collections.emptyList() : list2;
            this.f24583c = list3 == null ? Collections.emptyList() : list3;
        }

        @C0359n0
        /* renamed from: a */
        public static C9098g m33954a(@C0359n0 JsonValue jsonValue) {
            C9323b A = jsonValue.mo18749A();
            return new C9098g(C9004a0.m33498c(A.mo18801A(f24578d).mo18784z()), C9025i.m33598b(A.mo18801A(f24579e).mo18784z()), C9102u.m33982c(A.mo18801A(f24580f).mo18784z()));
        }

        @C0359n0
        /* renamed from: b */
        public List<C9025i> mo18084b() {
            return this.f24582b;
        }

        @C0359n0
        /* renamed from: c */
        public List<C9102u> mo18085c() {
            return this.f24583c;
        }

        @C0359n0
        /* renamed from: d */
        public List<C9004a0> mo18086d() {
            return this.f24581a;
        }

        @C0359n0
        /* renamed from: q */
        public JsonValue mo17264q() {
            return C9323b.m35017y().mo18822f(f24578d, JsonValue.m34975U(this.f24581a)).mo18822f(f24579e, JsonValue.m34975U(this.f24582b)).mo18822f(f24580f, JsonValue.m34975U(this.f24583c)).mo18817a().mo17264q();
        }

        public String toString() {
            return "UpdatePayload{tagGroupMutations=" + this.f24581a + ", attributeMutations= " + this.f24582b + ", subscriptionListMutations=" + this.f24583c + C12361b.f30259j;
        }
    }

    public C9091q(@C0359n0 String str, @C0363p0 C9094c cVar) {
        this.f24559a = str;
        this.f24560b = cVar;
    }

    @C0359n0
    /* renamed from: a */
    public static C9091q m33919a(@C0359n0 String str, @C0359n0 ChannelType channelType) {
        return new C9091q(f24556x, new C9092a(str, channelType));
    }

    @C0359n0
    /* renamed from: c */
    public static C9091q m33920c(JsonValue jsonValue) throws JsonException {
        C9094c cVar;
        C9323b A = jsonValue.mo18749A();
        String l = A.mo18801A(f24557y).mo18769l();
        if (l != null) {
            char c = 65535;
            switch (l.hashCode()) {
                case -1785516855:
                    if (l.equals(f24549c)) {
                        c = 0;
                        break;
                    }
                    break;
                case -1651814390:
                    if (l.equals(f24555w)) {
                        c = 1;
                        break;
                    }
                    break;
                case -1416098080:
                    if (l.equals(f24553g)) {
                        c = 2;
                        break;
                    }
                    break;
                case -520687454:
                    if (l.equals(f24556x)) {
                        c = 3;
                        break;
                    }
                    break;
                case 77866287:
                    if (l.equals(f24552f)) {
                        c = 4;
                        break;
                    }
                    break;
                case 610829725:
                    if (l.equals(f24554v)) {
                        c = 5;
                        break;
                    }
                    break;
                case 646864652:
                    if (l.equals(f24550d)) {
                        c = 6;
                        break;
                    }
                    break;
                case 1815350732:
                    if (l.equals(f24551e)) {
                        c = 7;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    cVar = C9098g.m33954a(A.mo18801A(f24558z));
                    break;
                case 1:
                    cVar = C9096e.m33946a(A.mo18801A(f24558z));
                    break;
                case 2:
                    cVar = C9095d.m33942a(A.mo18801A(f24558z));
                    break;
                case 3:
                    cVar = C9092a.m33935a(A.mo18801A(f24558z));
                    break;
                case 4:
                case 7:
                    cVar = null;
                    break;
                case 5:
                    cVar = C9097f.m33950a(A.mo18801A(f24558z));
                    break;
                case 6:
                    cVar = C9093b.m33939a(A.mo18801A(f24558z));
                    break;
                default:
                    throw new JsonException("Invalid contact operation  " + jsonValue);
            }
            return new C9091q(l, cVar);
        }
        throw new JsonException("Invalid contact operation  " + jsonValue);
    }

    @C0359n0
    /* renamed from: f */
    public static C9091q m33921f(@C0359n0 String str) {
        return new C9091q(f24550d, new C9093b(str));
    }

    @C0359n0
    /* renamed from: g */
    public static C9091q m33922g(@C0359n0 String str, @C0359n0 C9099r rVar) {
        return new C9091q(f24553g, new C9095d(str, rVar));
    }

    @C0359n0
    /* renamed from: h */
    public static C9091q m33923h(@C0359n0 String str, @C0359n0 C9100s sVar) {
        return new C9091q(f24555w, new C9096e(str, sVar));
    }

    @C0359n0
    /* renamed from: i */
    public static C9091q m33924i(@C0359n0 String str, @C0359n0 C9103v vVar) {
        return new C9091q(f24554v, new C9097f(str, vVar));
    }

    @C0359n0
    /* renamed from: j */
    public static C9091q m33925j() {
        return new C9091q(f24552f, (C9094c) null);
    }

    @C0359n0
    /* renamed from: k */
    public static C9091q m33926k() {
        return new C9091q(f24551e, (C9094c) null);
    }

    @C0359n0
    /* renamed from: l */
    public static C9091q m33927l(@C0363p0 List<C9004a0> list, @C0363p0 List<C9025i> list2, @C0363p0 List<C9102u> list3) {
        return new C9091q(f24549c, new C9098g(list, list2, list3));
    }

    @C0359n0
    /* renamed from: m */
    public static C9091q m33928m(@C0363p0 List<C9025i> list) {
        return m33927l((List<C9004a0>) null, list, (List<C9102u>) null);
    }

    @C0359n0
    /* renamed from: n */
    public static C9091q m33929n(@C0363p0 List<C9102u> list) {
        return m33927l((List<C9004a0>) null, (List<C9025i>) null, list);
    }

    /* renamed from: o */
    public static C9091q m33930o(@C0363p0 List<C9004a0> list) {
        return m33927l(list, (List<C9025i>) null, (List<C9102u>) null);
    }

    @C0359n0
    /* renamed from: b */
    public <S extends C9094c> S mo18070b() {
        S s = this.f24560b;
        if (s != null) {
            return s;
        }
        throw new IllegalArgumentException("Payload is null!");
    }

    @C0363p0
    /* renamed from: d */
    public C9094c mo18071d() {
        return this.f24560b;
    }

    @C0359n0
    /* renamed from: e */
    public String mo18072e() {
        return this.f24559a;
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        return C9323b.m35017y().mo18823g(f24557y, this.f24559a).mo18826j(f24558z, this.f24560b).mo18817a().mo17264q();
    }

    public String toString() {
        return "ContactOperation{type='" + this.f24559a + '\'' + ", payload=" + this.f24560b + C12361b.f30259j;
    }
}
