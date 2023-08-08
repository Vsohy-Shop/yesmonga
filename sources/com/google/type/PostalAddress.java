package com.google.type;

import com.google.protobuf.ByteString;
import com.google.protobuf.C34319a;
import com.google.protobuf.C34368g0;
import com.google.protobuf.C34448s;
import com.google.protobuf.C34471v0;
import com.google.protobuf.C34504y1;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class PostalAddress extends GeneratedMessageLite<PostalAddress, C34599b> implements C34622q {
    public static final int ADDRESS_LINES_FIELD_NUMBER = 9;
    public static final int ADMINISTRATIVE_AREA_FIELD_NUMBER = 6;
    /* access modifiers changed from: private */
    public static final PostalAddress DEFAULT_INSTANCE;
    public static final int LANGUAGE_CODE_FIELD_NUMBER = 3;
    public static final int LOCALITY_FIELD_NUMBER = 7;
    public static final int ORGANIZATION_FIELD_NUMBER = 11;
    private static volatile C34504y1<PostalAddress> PARSER = null;
    public static final int POSTAL_CODE_FIELD_NUMBER = 4;
    public static final int RECIPIENTS_FIELD_NUMBER = 10;
    public static final int REGION_CODE_FIELD_NUMBER = 2;
    public static final int REVISION_FIELD_NUMBER = 1;
    public static final int SORTING_CODE_FIELD_NUMBER = 5;
    public static final int SUBLOCALITY_FIELD_NUMBER = 8;
    private C34471v0.C34488k<String> addressLines_ = GeneratedMessageLite.emptyProtobufList();
    private String administrativeArea_ = "";
    private String languageCode_ = "";
    private String locality_ = "";
    private String organization_ = "";
    private String postalCode_ = "";
    private C34471v0.C34488k<String> recipients_ = GeneratedMessageLite.emptyProtobufList();
    private String regionCode_ = "";
    private int revision_;
    private String sortingCode_ = "";
    private String sublocality_ = "";

    /* renamed from: com.google.type.PostalAddress$a */
    public static /* synthetic */ class C34598a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f83687a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f83687a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f83687a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f83687a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f83687a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f83687a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f83687a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f83687a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.type.PostalAddress.C34598a.<clinit>():void");
        }
    }

    /* renamed from: com.google.type.PostalAddress$b */
    public static final class C34599b extends GeneratedMessageLite.C34263b<PostalAddress, C34599b> implements C34622q {
        public /* synthetic */ C34599b(C34598a aVar) {
            this();
        }

        /* renamed from: B0 */
        public C34599b mo102338B0(String str) {
            mo100457F();
            ((PostalAddress) this.f83053b).setRegionCode(str);
            return this;
        }

        /* renamed from: D0 */
        public C34599b mo102339D0(ByteString byteString) {
            mo100457F();
            ((PostalAddress) this.f83053b).setRegionCodeBytes(byteString);
            return this;
        }

        /* renamed from: E0 */
        public C34599b mo102340E0(int i) {
            mo100457F();
            ((PostalAddress) this.f83053b).setRevision(i);
            return this;
        }

        /* renamed from: F0 */
        public C34599b mo102341F0(String str) {
            mo100457F();
            ((PostalAddress) this.f83053b).setSortingCode(str);
            return this;
        }

        /* renamed from: G0 */
        public C34599b mo102342G0(ByteString byteString) {
            mo100457F();
            ((PostalAddress) this.f83053b).setSortingCodeBytes(byteString);
            return this;
        }

        /* renamed from: H0 */
        public C34599b mo102343H0(String str) {
            mo100457F();
            ((PostalAddress) this.f83053b).setSublocality(str);
            return this;
        }

        /* renamed from: I0 */
        public C34599b mo102344I0(ByteString byteString) {
            mo100457F();
            ((PostalAddress) this.f83053b).setSublocalityBytes(byteString);
            return this;
        }

        /* renamed from: P */
        public C34599b mo102345P(String str) {
            mo100457F();
            ((PostalAddress) this.f83053b).addAddressLines(str);
            return this;
        }

        /* renamed from: R */
        public C34599b mo102346R(ByteString byteString) {
            mo100457F();
            ((PostalAddress) this.f83053b).addAddressLinesBytes(byteString);
            return this;
        }

        /* renamed from: S */
        public C34599b mo102347S(Iterable<String> iterable) {
            mo100457F();
            ((PostalAddress) this.f83053b).addAllAddressLines(iterable);
            return this;
        }

        /* renamed from: T */
        public C34599b mo102348T(Iterable<String> iterable) {
            mo100457F();
            ((PostalAddress) this.f83053b).addAllRecipients(iterable);
            return this;
        }

        /* renamed from: U */
        public C34599b mo102349U(String str) {
            mo100457F();
            ((PostalAddress) this.f83053b).addRecipients(str);
            return this;
        }

        /* renamed from: V */
        public C34599b mo102350V(ByteString byteString) {
            mo100457F();
            ((PostalAddress) this.f83053b).addRecipientsBytes(byteString);
            return this;
        }

        /* renamed from: Y */
        public C34599b mo102351Y() {
            mo100457F();
            ((PostalAddress) this.f83053b).clearAddressLines();
            return this;
        }

        /* renamed from: Z */
        public C34599b mo102352Z() {
            mo100457F();
            ((PostalAddress) this.f83053b).clearAdministrativeArea();
            return this;
        }

        /* renamed from: a0 */
        public C34599b mo102353a0() {
            mo100457F();
            ((PostalAddress) this.f83053b).clearLanguageCode();
            return this;
        }

        /* renamed from: b0 */
        public C34599b mo102354b0() {
            mo100457F();
            ((PostalAddress) this.f83053b).clearLocality();
            return this;
        }

        /* renamed from: c0 */
        public C34599b mo102355c0() {
            mo100457F();
            ((PostalAddress) this.f83053b).clearOrganization();
            return this;
        }

        /* renamed from: d0 */
        public C34599b mo102356d0() {
            mo100457F();
            ((PostalAddress) this.f83053b).clearPostalCode();
            return this;
        }

        /* renamed from: g0 */
        public C34599b mo102357g0() {
            mo100457F();
            ((PostalAddress) this.f83053b).clearRecipients();
            return this;
        }

        public String getAddressLines(int i) {
            return ((PostalAddress) this.f83053b).getAddressLines(i);
        }

        public ByteString getAddressLinesBytes(int i) {
            return ((PostalAddress) this.f83053b).getAddressLinesBytes(i);
        }

        public int getAddressLinesCount() {
            return ((PostalAddress) this.f83053b).getAddressLinesCount();
        }

        public List<String> getAddressLinesList() {
            return Collections.unmodifiableList(((PostalAddress) this.f83053b).getAddressLinesList());
        }

        public String getAdministrativeArea() {
            return ((PostalAddress) this.f83053b).getAdministrativeArea();
        }

        public ByteString getAdministrativeAreaBytes() {
            return ((PostalAddress) this.f83053b).getAdministrativeAreaBytes();
        }

        public String getLanguageCode() {
            return ((PostalAddress) this.f83053b).getLanguageCode();
        }

        public ByteString getLanguageCodeBytes() {
            return ((PostalAddress) this.f83053b).getLanguageCodeBytes();
        }

        public String getLocality() {
            return ((PostalAddress) this.f83053b).getLocality();
        }

        public ByteString getLocalityBytes() {
            return ((PostalAddress) this.f83053b).getLocalityBytes();
        }

        public String getOrganization() {
            return ((PostalAddress) this.f83053b).getOrganization();
        }

        public ByteString getOrganizationBytes() {
            return ((PostalAddress) this.f83053b).getOrganizationBytes();
        }

        public String getPostalCode() {
            return ((PostalAddress) this.f83053b).getPostalCode();
        }

        public ByteString getPostalCodeBytes() {
            return ((PostalAddress) this.f83053b).getPostalCodeBytes();
        }

        public String getRecipients(int i) {
            return ((PostalAddress) this.f83053b).getRecipients(i);
        }

        public ByteString getRecipientsBytes(int i) {
            return ((PostalAddress) this.f83053b).getRecipientsBytes(i);
        }

        public int getRecipientsCount() {
            return ((PostalAddress) this.f83053b).getRecipientsCount();
        }

        public List<String> getRecipientsList() {
            return Collections.unmodifiableList(((PostalAddress) this.f83053b).getRecipientsList());
        }

        public String getRegionCode() {
            return ((PostalAddress) this.f83053b).getRegionCode();
        }

        public ByteString getRegionCodeBytes() {
            return ((PostalAddress) this.f83053b).getRegionCodeBytes();
        }

        public int getRevision() {
            return ((PostalAddress) this.f83053b).getRevision();
        }

        public String getSortingCode() {
            return ((PostalAddress) this.f83053b).getSortingCode();
        }

        public ByteString getSortingCodeBytes() {
            return ((PostalAddress) this.f83053b).getSortingCodeBytes();
        }

        public String getSublocality() {
            return ((PostalAddress) this.f83053b).getSublocality();
        }

        public ByteString getSublocalityBytes() {
            return ((PostalAddress) this.f83053b).getSublocalityBytes();
        }

        /* renamed from: h0 */
        public C34599b mo102358h0() {
            mo100457F();
            ((PostalAddress) this.f83053b).clearRegionCode();
            return this;
        }

        /* renamed from: i0 */
        public C34599b mo102359i0() {
            mo100457F();
            ((PostalAddress) this.f83053b).clearRevision();
            return this;
        }

        /* renamed from: j0 */
        public C34599b mo102360j0() {
            mo100457F();
            ((PostalAddress) this.f83053b).clearSortingCode();
            return this;
        }

        /* renamed from: k0 */
        public C34599b mo102361k0() {
            mo100457F();
            ((PostalAddress) this.f83053b).clearSublocality();
            return this;
        }

        /* renamed from: l0 */
        public C34599b mo102362l0(int i, String str) {
            mo100457F();
            ((PostalAddress) this.f83053b).setAddressLines(i, str);
            return this;
        }

        /* renamed from: m0 */
        public C34599b mo102363m0(String str) {
            mo100457F();
            ((PostalAddress) this.f83053b).setAdministrativeArea(str);
            return this;
        }

        /* renamed from: o0 */
        public C34599b mo102364o0(ByteString byteString) {
            mo100457F();
            ((PostalAddress) this.f83053b).setAdministrativeAreaBytes(byteString);
            return this;
        }

        /* renamed from: q0 */
        public C34599b mo102365q0(String str) {
            mo100457F();
            ((PostalAddress) this.f83053b).setLanguageCode(str);
            return this;
        }

        /* renamed from: r0 */
        public C34599b mo102366r0(ByteString byteString) {
            mo100457F();
            ((PostalAddress) this.f83053b).setLanguageCodeBytes(byteString);
            return this;
        }

        /* renamed from: s0 */
        public C34599b mo102367s0(String str) {
            mo100457F();
            ((PostalAddress) this.f83053b).setLocality(str);
            return this;
        }

        /* renamed from: u0 */
        public C34599b mo102368u0(ByteString byteString) {
            mo100457F();
            ((PostalAddress) this.f83053b).setLocalityBytes(byteString);
            return this;
        }

        /* renamed from: v0 */
        public C34599b mo102369v0(String str) {
            mo100457F();
            ((PostalAddress) this.f83053b).setOrganization(str);
            return this;
        }

        /* renamed from: w0 */
        public C34599b mo102370w0(ByteString byteString) {
            mo100457F();
            ((PostalAddress) this.f83053b).setOrganizationBytes(byteString);
            return this;
        }

        /* renamed from: x0 */
        public C34599b mo102371x0(String str) {
            mo100457F();
            ((PostalAddress) this.f83053b).setPostalCode(str);
            return this;
        }

        /* renamed from: y0 */
        public C34599b mo102372y0(ByteString byteString) {
            mo100457F();
            ((PostalAddress) this.f83053b).setPostalCodeBytes(byteString);
            return this;
        }

        /* renamed from: z0 */
        public C34599b mo102373z0(int i, String str) {
            mo100457F();
            ((PostalAddress) this.f83053b).setRecipients(i, str);
            return this;
        }

        public C34599b() {
            super(PostalAddress.DEFAULT_INSTANCE);
        }
    }

    static {
        PostalAddress postalAddress = new PostalAddress();
        DEFAULT_INSTANCE = postalAddress;
        GeneratedMessageLite.registerDefaultInstance(PostalAddress.class, postalAddress);
    }

    private PostalAddress() {
    }

    /* access modifiers changed from: private */
    public void addAddressLines(String str) {
        str.getClass();
        ensureAddressLinesIsMutable();
        this.addressLines_.add(str);
    }

    /* access modifiers changed from: private */
    public void addAddressLinesBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        ensureAddressLinesIsMutable();
        this.addressLines_.add(byteString.mo99228S0());
    }

    /* access modifiers changed from: private */
    public void addAllAddressLines(Iterable<String> iterable) {
        ensureAddressLinesIsMutable();
        C34319a.addAll(iterable, this.addressLines_);
    }

    /* access modifiers changed from: private */
    public void addAllRecipients(Iterable<String> iterable) {
        ensureRecipientsIsMutable();
        C34319a.addAll(iterable, this.recipients_);
    }

    /* access modifiers changed from: private */
    public void addRecipients(String str) {
        str.getClass();
        ensureRecipientsIsMutable();
        this.recipients_.add(str);
    }

    /* access modifiers changed from: private */
    public void addRecipientsBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        ensureRecipientsIsMutable();
        this.recipients_.add(byteString.mo99228S0());
    }

    /* access modifiers changed from: private */
    public void clearAddressLines() {
        this.addressLines_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearAdministrativeArea() {
        this.administrativeArea_ = getDefaultInstance().getAdministrativeArea();
    }

    /* access modifiers changed from: private */
    public void clearLanguageCode() {
        this.languageCode_ = getDefaultInstance().getLanguageCode();
    }

    /* access modifiers changed from: private */
    public void clearLocality() {
        this.locality_ = getDefaultInstance().getLocality();
    }

    /* access modifiers changed from: private */
    public void clearOrganization() {
        this.organization_ = getDefaultInstance().getOrganization();
    }

    /* access modifiers changed from: private */
    public void clearPostalCode() {
        this.postalCode_ = getDefaultInstance().getPostalCode();
    }

    /* access modifiers changed from: private */
    public void clearRecipients() {
        this.recipients_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearRegionCode() {
        this.regionCode_ = getDefaultInstance().getRegionCode();
    }

    /* access modifiers changed from: private */
    public void clearRevision() {
        this.revision_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearSortingCode() {
        this.sortingCode_ = getDefaultInstance().getSortingCode();
    }

    /* access modifiers changed from: private */
    public void clearSublocality() {
        this.sublocality_ = getDefaultInstance().getSublocality();
    }

    private void ensureAddressLinesIsMutable() {
        C34471v0.C34488k<String> kVar = this.addressLines_;
        if (!kVar.mo100971T()) {
            this.addressLines_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    private void ensureRecipientsIsMutable() {
        C34471v0.C34488k<String> kVar = this.recipients_;
        if (!kVar.mo100971T()) {
            this.recipients_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    public static PostalAddress getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C34599b newBuilder() {
        return (C34599b) DEFAULT_INSTANCE.createBuilder();
    }

    public static PostalAddress parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PostalAddress) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PostalAddress parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PostalAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<PostalAddress> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setAddressLines(int i, String str) {
        str.getClass();
        ensureAddressLinesIsMutable();
        this.addressLines_.set(i, str);
    }

    /* access modifiers changed from: private */
    public void setAdministrativeArea(String str) {
        str.getClass();
        this.administrativeArea_ = str;
    }

    /* access modifiers changed from: private */
    public void setAdministrativeAreaBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.administrativeArea_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setLanguageCode(String str) {
        str.getClass();
        this.languageCode_ = str;
    }

    /* access modifiers changed from: private */
    public void setLanguageCodeBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.languageCode_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setLocality(String str) {
        str.getClass();
        this.locality_ = str;
    }

    /* access modifiers changed from: private */
    public void setLocalityBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.locality_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setOrganization(String str) {
        str.getClass();
        this.organization_ = str;
    }

    /* access modifiers changed from: private */
    public void setOrganizationBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.organization_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setPostalCode(String str) {
        str.getClass();
        this.postalCode_ = str;
    }

    /* access modifiers changed from: private */
    public void setPostalCodeBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.postalCode_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setRecipients(int i, String str) {
        str.getClass();
        ensureRecipientsIsMutable();
        this.recipients_.set(i, str);
    }

    /* access modifiers changed from: private */
    public void setRegionCode(String str) {
        str.getClass();
        this.regionCode_ = str;
    }

    /* access modifiers changed from: private */
    public void setRegionCodeBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.regionCode_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setRevision(int i) {
        this.revision_ = i;
    }

    /* access modifiers changed from: private */
    public void setSortingCode(String str) {
        str.getClass();
        this.sortingCode_ = str;
    }

    /* access modifiers changed from: private */
    public void setSortingCodeBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.sortingCode_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setSublocality(String str) {
        str.getClass();
        this.sublocality_ = str;
    }

    /* access modifiers changed from: private */
    public void setSublocalityBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.sublocality_ = byteString.mo99228S0();
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C34598a.f83687a[methodToInvoke.ordinal()]) {
            case 1:
                return new PostalAddress();
            case 2:
                return new C34599b((C34598a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0002\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȚ\nȚ\u000bȈ", new Object[]{"revision_", "regionCode_", "languageCode_", "postalCode_", "sortingCode_", "administrativeArea_", "locality_", "sublocality_", "addressLines_", "recipients_", "organization_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<PostalAddress> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (PostalAddress.class) {
                        y1Var = PARSER;
                        if (y1Var == null) {
                            y1Var = new GeneratedMessageLite.C34264c<>(DEFAULT_INSTANCE);
                            PARSER = y1Var;
                        }
                    }
                }
                return y1Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public String getAddressLines(int i) {
        return this.addressLines_.get(i);
    }

    public ByteString getAddressLinesBytes(int i) {
        return ByteString.m137260e0(this.addressLines_.get(i));
    }

    public int getAddressLinesCount() {
        return this.addressLines_.size();
    }

    public List<String> getAddressLinesList() {
        return this.addressLines_;
    }

    public String getAdministrativeArea() {
        return this.administrativeArea_;
    }

    public ByteString getAdministrativeAreaBytes() {
        return ByteString.m137260e0(this.administrativeArea_);
    }

    public String getLanguageCode() {
        return this.languageCode_;
    }

    public ByteString getLanguageCodeBytes() {
        return ByteString.m137260e0(this.languageCode_);
    }

    public String getLocality() {
        return this.locality_;
    }

    public ByteString getLocalityBytes() {
        return ByteString.m137260e0(this.locality_);
    }

    public String getOrganization() {
        return this.organization_;
    }

    public ByteString getOrganizationBytes() {
        return ByteString.m137260e0(this.organization_);
    }

    public String getPostalCode() {
        return this.postalCode_;
    }

    public ByteString getPostalCodeBytes() {
        return ByteString.m137260e0(this.postalCode_);
    }

    public String getRecipients(int i) {
        return this.recipients_.get(i);
    }

    public ByteString getRecipientsBytes(int i) {
        return ByteString.m137260e0(this.recipients_.get(i));
    }

    public int getRecipientsCount() {
        return this.recipients_.size();
    }

    public List<String> getRecipientsList() {
        return this.recipients_;
    }

    public String getRegionCode() {
        return this.regionCode_;
    }

    public ByteString getRegionCodeBytes() {
        return ByteString.m137260e0(this.regionCode_);
    }

    public int getRevision() {
        return this.revision_;
    }

    public String getSortingCode() {
        return this.sortingCode_;
    }

    public ByteString getSortingCodeBytes() {
        return ByteString.m137260e0(this.sortingCode_);
    }

    public String getSublocality() {
        return this.sublocality_;
    }

    public ByteString getSublocalityBytes() {
        return ByteString.m137260e0(this.sublocality_);
    }

    public static C34599b newBuilder(PostalAddress postalAddress) {
        return (C34599b) DEFAULT_INSTANCE.createBuilder(postalAddress);
    }

    public static PostalAddress parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (PostalAddress) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static PostalAddress parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (PostalAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static PostalAddress parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PostalAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PostalAddress parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (PostalAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static PostalAddress parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PostalAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PostalAddress parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (PostalAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static PostalAddress parseFrom(InputStream inputStream) throws IOException {
        return (PostalAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PostalAddress parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (PostalAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static PostalAddress parseFrom(C34448s sVar) throws IOException {
        return (PostalAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static PostalAddress parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (PostalAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
