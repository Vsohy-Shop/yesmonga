package com.carrefour.fid.android;

import com.carrefour.fid.android.UserAddress;
import com.carrefour.fid.android.UserCard;
import com.carrefour.fid.android.UserConsent;
import com.carrefour.fid.android.UserPhone;
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

public final class UserInfo extends GeneratedMessageLite<UserInfo, C13137b> implements C14084z0 {
    public static final int ADDRESSES_FIELD_NUMBER = 9;
    public static final int BIRTHDATE_FIELD_NUMBER = 4;
    public static final int CARDS_FIELD_NUMBER = 10;
    public static final int CGU_FIELD_NUMBER = 6;
    public static final int CIVILITY_FIELD_NUMBER = 5;
    public static final int CONSENTS_FIELD_NUMBER = 12;
    public static final int DATEOFSAVE_FIELD_NUMBER = 7;
    /* access modifiers changed from: private */
    public static final UserInfo DEFAULT_INSTANCE;
    public static final int EMAIL_FIELD_NUMBER = 1;
    public static final int FIRSTNAME_FIELD_NUMBER = 2;
    public static final int LASTMODIFICATION_FIELD_NUMBER = 8;
    public static final int LASTNAME_FIELD_NUMBER = 3;
    private static volatile C34504y1<UserInfo> PARSER = null;
    public static final int PHONES_FIELD_NUMBER = 11;
    private C34471v0.C34488k<UserAddress> addresses_ = GeneratedMessageLite.emptyProtobufList();
    private String birthDate_ = "";
    private C34471v0.C34488k<UserCard> cards_ = GeneratedMessageLite.emptyProtobufList();
    private String cgu_ = "";
    private String civility_ = "";
    private C34471v0.C34488k<UserConsent> consents_ = GeneratedMessageLite.emptyProtobufList();
    private long dateOfSave_;
    private String email_ = "";
    private String firstName_ = "";
    private String lastModification_ = "";
    private String lastName_ = "";
    private C34471v0.C34488k<UserPhone> phones_ = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: com.carrefour.fid.android.UserInfo$a */
    public static /* synthetic */ class C13136a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32257a;

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
                f32257a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f32257a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f32257a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f32257a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f32257a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f32257a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f32257a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.UserInfo.C13136a.<clinit>():void");
        }
    }

    /* renamed from: com.carrefour.fid.android.UserInfo$b */
    public static final class C13137b extends GeneratedMessageLite.C34263b<UserInfo, C13137b> implements C14084z0 {
        /* renamed from: B0 */
        public C13137b mo31051B0() {
            mo100457F();
            ((UserInfo) this.f83053b).clearLastModification();
            return this;
        }

        /* renamed from: D0 */
        public C13137b mo31052D0() {
            mo100457F();
            ((UserInfo) this.f83053b).clearLastName();
            return this;
        }

        /* renamed from: E0 */
        public C13137b mo31053E0() {
            mo100457F();
            ((UserInfo) this.f83053b).clearPhones();
            return this;
        }

        /* renamed from: F0 */
        public C13137b mo31054F0(int i) {
            mo100457F();
            ((UserInfo) this.f83053b).removeAddresses(i);
            return this;
        }

        /* renamed from: G0 */
        public C13137b mo31055G0(int i) {
            mo100457F();
            ((UserInfo) this.f83053b).removeCards(i);
            return this;
        }

        /* renamed from: H0 */
        public C13137b mo31056H0(int i) {
            mo100457F();
            ((UserInfo) this.f83053b).removeConsents(i);
            return this;
        }

        /* renamed from: I0 */
        public C13137b mo31057I0(int i) {
            mo100457F();
            ((UserInfo) this.f83053b).removePhones(i);
            return this;
        }

        /* renamed from: J0 */
        public C13137b mo31058J0(int i, UserAddress.C13131b bVar) {
            mo100457F();
            ((UserInfo) this.f83053b).setAddresses(i, (UserAddress) bVar.mo100473g());
            return this;
        }

        /* renamed from: L0 */
        public C13137b mo31059L0(int i, UserAddress userAddress) {
            mo100457F();
            ((UserInfo) this.f83053b).setAddresses(i, userAddress);
            return this;
        }

        /* renamed from: M0 */
        public C13137b mo31060M0(String str) {
            mo100457F();
            ((UserInfo) this.f83053b).setBirthDate(str);
            return this;
        }

        /* renamed from: O0 */
        public C13137b mo31061O0(ByteString byteString) {
            mo100457F();
            ((UserInfo) this.f83053b).setBirthDateBytes(byteString);
            return this;
        }

        /* renamed from: P */
        public C13137b mo31062P(int i, UserAddress.C13131b bVar) {
            mo100457F();
            ((UserInfo) this.f83053b).addAddresses(i, (UserAddress) bVar.mo100473g());
            return this;
        }

        /* renamed from: P0 */
        public C13137b mo31063P0(int i, UserCard.C13133b bVar) {
            mo100457F();
            ((UserInfo) this.f83053b).setCards(i, (UserCard) bVar.mo100473g());
            return this;
        }

        /* renamed from: Q0 */
        public C13137b mo31064Q0(int i, UserCard userCard) {
            mo100457F();
            ((UserInfo) this.f83053b).setCards(i, userCard);
            return this;
        }

        /* renamed from: R */
        public C13137b mo31065R(int i, UserAddress userAddress) {
            mo100457F();
            ((UserInfo) this.f83053b).addAddresses(i, userAddress);
            return this;
        }

        /* renamed from: R0 */
        public C13137b mo31066R0(String str) {
            mo100457F();
            ((UserInfo) this.f83053b).setCgu(str);
            return this;
        }

        /* renamed from: S */
        public C13137b mo31067S(UserAddress.C13131b bVar) {
            mo100457F();
            ((UserInfo) this.f83053b).addAddresses((UserAddress) bVar.mo100473g());
            return this;
        }

        /* renamed from: S0 */
        public C13137b mo31068S0(ByteString byteString) {
            mo100457F();
            ((UserInfo) this.f83053b).setCguBytes(byteString);
            return this;
        }

        /* renamed from: T */
        public C13137b mo31069T(UserAddress userAddress) {
            mo100457F();
            ((UserInfo) this.f83053b).addAddresses(userAddress);
            return this;
        }

        /* renamed from: T0 */
        public C13137b mo31070T0(String str) {
            mo100457F();
            ((UserInfo) this.f83053b).setCivility(str);
            return this;
        }

        /* renamed from: U */
        public C13137b mo31071U(Iterable<? extends UserAddress> iterable) {
            mo100457F();
            ((UserInfo) this.f83053b).addAllAddresses(iterable);
            return this;
        }

        /* renamed from: U0 */
        public C13137b mo31072U0(ByteString byteString) {
            mo100457F();
            ((UserInfo) this.f83053b).setCivilityBytes(byteString);
            return this;
        }

        /* renamed from: V */
        public C13137b mo31073V(Iterable<? extends UserCard> iterable) {
            mo100457F();
            ((UserInfo) this.f83053b).addAllCards(iterable);
            return this;
        }

        /* renamed from: V0 */
        public C13137b mo31074V0(int i, UserConsent.C13135b bVar) {
            mo100457F();
            ((UserInfo) this.f83053b).setConsents(i, (UserConsent) bVar.mo100473g());
            return this;
        }

        /* renamed from: W0 */
        public C13137b mo31075W0(int i, UserConsent userConsent) {
            mo100457F();
            ((UserInfo) this.f83053b).setConsents(i, userConsent);
            return this;
        }

        /* renamed from: X0 */
        public C13137b mo31076X0(long j) {
            mo100457F();
            ((UserInfo) this.f83053b).setDateOfSave(j);
            return this;
        }

        /* renamed from: Y */
        public C13137b mo31077Y(Iterable<? extends UserConsent> iterable) {
            mo100457F();
            ((UserInfo) this.f83053b).addAllConsents(iterable);
            return this;
        }

        /* renamed from: Y0 */
        public C13137b mo31078Y0(String str) {
            mo100457F();
            ((UserInfo) this.f83053b).setEmail(str);
            return this;
        }

        /* renamed from: Z */
        public C13137b mo31079Z(Iterable<? extends UserPhone> iterable) {
            mo100457F();
            ((UserInfo) this.f83053b).addAllPhones(iterable);
            return this;
        }

        /* renamed from: Z0 */
        public C13137b mo31080Z0(ByteString byteString) {
            mo100457F();
            ((UserInfo) this.f83053b).setEmailBytes(byteString);
            return this;
        }

        /* renamed from: a0 */
        public C13137b mo31081a0(int i, UserCard.C13133b bVar) {
            mo100457F();
            ((UserInfo) this.f83053b).addCards(i, (UserCard) bVar.mo100473g());
            return this;
        }

        /* renamed from: a1 */
        public C13137b mo31082a1(String str) {
            mo100457F();
            ((UserInfo) this.f83053b).setFirstName(str);
            return this;
        }

        /* renamed from: b0 */
        public C13137b mo31083b0(int i, UserCard userCard) {
            mo100457F();
            ((UserInfo) this.f83053b).addCards(i, userCard);
            return this;
        }

        /* renamed from: b1 */
        public C13137b mo31084b1(ByteString byteString) {
            mo100457F();
            ((UserInfo) this.f83053b).setFirstNameBytes(byteString);
            return this;
        }

        /* renamed from: c0 */
        public C13137b mo31085c0(UserCard.C13133b bVar) {
            mo100457F();
            ((UserInfo) this.f83053b).addCards((UserCard) bVar.mo100473g());
            return this;
        }

        /* renamed from: c1 */
        public C13137b mo31086c1(String str) {
            mo100457F();
            ((UserInfo) this.f83053b).setLastModification(str);
            return this;
        }

        /* renamed from: d0 */
        public C13137b mo31087d0(UserCard userCard) {
            mo100457F();
            ((UserInfo) this.f83053b).addCards(userCard);
            return this;
        }

        /* renamed from: d1 */
        public C13137b mo31088d1(ByteString byteString) {
            mo100457F();
            ((UserInfo) this.f83053b).setLastModificationBytes(byteString);
            return this;
        }

        /* renamed from: e1 */
        public C13137b mo31089e1(String str) {
            mo100457F();
            ((UserInfo) this.f83053b).setLastName(str);
            return this;
        }

        /* renamed from: f1 */
        public C13137b mo31090f1(ByteString byteString) {
            mo100457F();
            ((UserInfo) this.f83053b).setLastNameBytes(byteString);
            return this;
        }

        /* renamed from: g0 */
        public C13137b mo31091g0(int i, UserConsent.C13135b bVar) {
            mo100457F();
            ((UserInfo) this.f83053b).addConsents(i, (UserConsent) bVar.mo100473g());
            return this;
        }

        /* renamed from: g1 */
        public C13137b mo31092g1(int i, UserPhone.C13139b bVar) {
            mo100457F();
            ((UserInfo) this.f83053b).setPhones(i, (UserPhone) bVar.mo100473g());
            return this;
        }

        public UserAddress getAddresses(int i) {
            return ((UserInfo) this.f83053b).getAddresses(i);
        }

        public int getAddressesCount() {
            return ((UserInfo) this.f83053b).getAddressesCount();
        }

        public List<UserAddress> getAddressesList() {
            return Collections.unmodifiableList(((UserInfo) this.f83053b).getAddressesList());
        }

        public String getBirthDate() {
            return ((UserInfo) this.f83053b).getBirthDate();
        }

        public ByteString getBirthDateBytes() {
            return ((UserInfo) this.f83053b).getBirthDateBytes();
        }

        public UserCard getCards(int i) {
            return ((UserInfo) this.f83053b).getCards(i);
        }

        public int getCardsCount() {
            return ((UserInfo) this.f83053b).getCardsCount();
        }

        public List<UserCard> getCardsList() {
            return Collections.unmodifiableList(((UserInfo) this.f83053b).getCardsList());
        }

        public String getCgu() {
            return ((UserInfo) this.f83053b).getCgu();
        }

        public ByteString getCguBytes() {
            return ((UserInfo) this.f83053b).getCguBytes();
        }

        public String getCivility() {
            return ((UserInfo) this.f83053b).getCivility();
        }

        public ByteString getCivilityBytes() {
            return ((UserInfo) this.f83053b).getCivilityBytes();
        }

        public UserConsent getConsents(int i) {
            return ((UserInfo) this.f83053b).getConsents(i);
        }

        public int getConsentsCount() {
            return ((UserInfo) this.f83053b).getConsentsCount();
        }

        public List<UserConsent> getConsentsList() {
            return Collections.unmodifiableList(((UserInfo) this.f83053b).getConsentsList());
        }

        public long getDateOfSave() {
            return ((UserInfo) this.f83053b).getDateOfSave();
        }

        public String getEmail() {
            return ((UserInfo) this.f83053b).getEmail();
        }

        public ByteString getEmailBytes() {
            return ((UserInfo) this.f83053b).getEmailBytes();
        }

        public String getFirstName() {
            return ((UserInfo) this.f83053b).getFirstName();
        }

        public ByteString getFirstNameBytes() {
            return ((UserInfo) this.f83053b).getFirstNameBytes();
        }

        public String getLastModification() {
            return ((UserInfo) this.f83053b).getLastModification();
        }

        public ByteString getLastModificationBytes() {
            return ((UserInfo) this.f83053b).getLastModificationBytes();
        }

        public String getLastName() {
            return ((UserInfo) this.f83053b).getLastName();
        }

        public ByteString getLastNameBytes() {
            return ((UserInfo) this.f83053b).getLastNameBytes();
        }

        public UserPhone getPhones(int i) {
            return ((UserInfo) this.f83053b).getPhones(i);
        }

        public int getPhonesCount() {
            return ((UserInfo) this.f83053b).getPhonesCount();
        }

        public List<UserPhone> getPhonesList() {
            return Collections.unmodifiableList(((UserInfo) this.f83053b).getPhonesList());
        }

        /* renamed from: h0 */
        public C13137b mo31093h0(int i, UserConsent userConsent) {
            mo100457F();
            ((UserInfo) this.f83053b).addConsents(i, userConsent);
            return this;
        }

        /* renamed from: h1 */
        public C13137b mo31094h1(int i, UserPhone userPhone) {
            mo100457F();
            ((UserInfo) this.f83053b).setPhones(i, userPhone);
            return this;
        }

        /* renamed from: i0 */
        public C13137b mo31095i0(UserConsent.C13135b bVar) {
            mo100457F();
            ((UserInfo) this.f83053b).addConsents((UserConsent) bVar.mo100473g());
            return this;
        }

        /* renamed from: j0 */
        public C13137b mo31096j0(UserConsent userConsent) {
            mo100457F();
            ((UserInfo) this.f83053b).addConsents(userConsent);
            return this;
        }

        /* renamed from: k0 */
        public C13137b mo31097k0(int i, UserPhone.C13139b bVar) {
            mo100457F();
            ((UserInfo) this.f83053b).addPhones(i, (UserPhone) bVar.mo100473g());
            return this;
        }

        /* renamed from: l0 */
        public C13137b mo31098l0(int i, UserPhone userPhone) {
            mo100457F();
            ((UserInfo) this.f83053b).addPhones(i, userPhone);
            return this;
        }

        /* renamed from: m0 */
        public C13137b mo31099m0(UserPhone.C13139b bVar) {
            mo100457F();
            ((UserInfo) this.f83053b).addPhones((UserPhone) bVar.mo100473g());
            return this;
        }

        /* renamed from: o0 */
        public C13137b mo31100o0(UserPhone userPhone) {
            mo100457F();
            ((UserInfo) this.f83053b).addPhones(userPhone);
            return this;
        }

        /* renamed from: q0 */
        public C13137b mo31101q0() {
            mo100457F();
            ((UserInfo) this.f83053b).clearAddresses();
            return this;
        }

        /* renamed from: r0 */
        public C13137b mo31102r0() {
            mo100457F();
            ((UserInfo) this.f83053b).clearBirthDate();
            return this;
        }

        /* renamed from: s0 */
        public C13137b mo31103s0() {
            mo100457F();
            ((UserInfo) this.f83053b).clearCards();
            return this;
        }

        /* renamed from: u0 */
        public C13137b mo31104u0() {
            mo100457F();
            ((UserInfo) this.f83053b).clearCgu();
            return this;
        }

        /* renamed from: v0 */
        public C13137b mo31105v0() {
            mo100457F();
            ((UserInfo) this.f83053b).clearCivility();
            return this;
        }

        /* renamed from: w0 */
        public C13137b mo31106w0() {
            mo100457F();
            ((UserInfo) this.f83053b).clearConsents();
            return this;
        }

        /* renamed from: x0 */
        public C13137b mo31107x0() {
            mo100457F();
            ((UserInfo) this.f83053b).clearDateOfSave();
            return this;
        }

        /* renamed from: y0 */
        public C13137b mo31108y0() {
            mo100457F();
            ((UserInfo) this.f83053b).clearEmail();
            return this;
        }

        /* renamed from: z0 */
        public C13137b mo31109z0() {
            mo100457F();
            ((UserInfo) this.f83053b).clearFirstName();
            return this;
        }

        public C13137b() {
            super(UserInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        UserInfo userInfo = new UserInfo();
        DEFAULT_INSTANCE = userInfo;
        GeneratedMessageLite.registerDefaultInstance(UserInfo.class, userInfo);
    }

    private UserInfo() {
    }

    /* access modifiers changed from: private */
    public void addAddresses(UserAddress userAddress) {
        userAddress.getClass();
        ensureAddressesIsMutable();
        this.addresses_.add(userAddress);
    }

    /* access modifiers changed from: private */
    public void addAllAddresses(Iterable<? extends UserAddress> iterable) {
        ensureAddressesIsMutable();
        C34319a.addAll(iterable, this.addresses_);
    }

    /* access modifiers changed from: private */
    public void addAllCards(Iterable<? extends UserCard> iterable) {
        ensureCardsIsMutable();
        C34319a.addAll(iterable, this.cards_);
    }

    /* access modifiers changed from: private */
    public void addAllConsents(Iterable<? extends UserConsent> iterable) {
        ensureConsentsIsMutable();
        C34319a.addAll(iterable, this.consents_);
    }

    /* access modifiers changed from: private */
    public void addAllPhones(Iterable<? extends UserPhone> iterable) {
        ensurePhonesIsMutable();
        C34319a.addAll(iterable, this.phones_);
    }

    /* access modifiers changed from: private */
    public void addCards(UserCard userCard) {
        userCard.getClass();
        ensureCardsIsMutable();
        this.cards_.add(userCard);
    }

    /* access modifiers changed from: private */
    public void addConsents(UserConsent userConsent) {
        userConsent.getClass();
        ensureConsentsIsMutable();
        this.consents_.add(userConsent);
    }

    /* access modifiers changed from: private */
    public void addPhones(UserPhone userPhone) {
        userPhone.getClass();
        ensurePhonesIsMutable();
        this.phones_.add(userPhone);
    }

    /* access modifiers changed from: private */
    public void clearAddresses() {
        this.addresses_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearBirthDate() {
        this.birthDate_ = getDefaultInstance().getBirthDate();
    }

    /* access modifiers changed from: private */
    public void clearCards() {
        this.cards_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearCgu() {
        this.cgu_ = getDefaultInstance().getCgu();
    }

    /* access modifiers changed from: private */
    public void clearCivility() {
        this.civility_ = getDefaultInstance().getCivility();
    }

    /* access modifiers changed from: private */
    public void clearConsents() {
        this.consents_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearDateOfSave() {
        this.dateOfSave_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearEmail() {
        this.email_ = getDefaultInstance().getEmail();
    }

    /* access modifiers changed from: private */
    public void clearFirstName() {
        this.firstName_ = getDefaultInstance().getFirstName();
    }

    /* access modifiers changed from: private */
    public void clearLastModification() {
        this.lastModification_ = getDefaultInstance().getLastModification();
    }

    /* access modifiers changed from: private */
    public void clearLastName() {
        this.lastName_ = getDefaultInstance().getLastName();
    }

    /* access modifiers changed from: private */
    public void clearPhones() {
        this.phones_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureAddressesIsMutable() {
        C34471v0.C34488k<UserAddress> kVar = this.addresses_;
        if (!kVar.mo100971T()) {
            this.addresses_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    private void ensureCardsIsMutable() {
        C34471v0.C34488k<UserCard> kVar = this.cards_;
        if (!kVar.mo100971T()) {
            this.cards_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    private void ensureConsentsIsMutable() {
        C34471v0.C34488k<UserConsent> kVar = this.consents_;
        if (!kVar.mo100971T()) {
            this.consents_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    private void ensurePhonesIsMutable() {
        C34471v0.C34488k<UserPhone> kVar = this.phones_;
        if (!kVar.mo100971T()) {
            this.phones_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    public static UserInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C13137b newBuilder() {
        return (C13137b) DEFAULT_INSTANCE.createBuilder();
    }

    public static UserInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UserInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<UserInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void removeAddresses(int i) {
        ensureAddressesIsMutable();
        this.addresses_.remove(i);
    }

    /* access modifiers changed from: private */
    public void removeCards(int i) {
        ensureCardsIsMutable();
        this.cards_.remove(i);
    }

    /* access modifiers changed from: private */
    public void removeConsents(int i) {
        ensureConsentsIsMutable();
        this.consents_.remove(i);
    }

    /* access modifiers changed from: private */
    public void removePhones(int i) {
        ensurePhonesIsMutable();
        this.phones_.remove(i);
    }

    /* access modifiers changed from: private */
    public void setAddresses(int i, UserAddress userAddress) {
        userAddress.getClass();
        ensureAddressesIsMutable();
        this.addresses_.set(i, userAddress);
    }

    /* access modifiers changed from: private */
    public void setBirthDate(String str) {
        str.getClass();
        this.birthDate_ = str;
    }

    /* access modifiers changed from: private */
    public void setBirthDateBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.birthDate_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setCards(int i, UserCard userCard) {
        userCard.getClass();
        ensureCardsIsMutable();
        this.cards_.set(i, userCard);
    }

    /* access modifiers changed from: private */
    public void setCgu(String str) {
        str.getClass();
        this.cgu_ = str;
    }

    /* access modifiers changed from: private */
    public void setCguBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.cgu_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setCivility(String str) {
        str.getClass();
        this.civility_ = str;
    }

    /* access modifiers changed from: private */
    public void setCivilityBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.civility_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setConsents(int i, UserConsent userConsent) {
        userConsent.getClass();
        ensureConsentsIsMutable();
        this.consents_.set(i, userConsent);
    }

    /* access modifiers changed from: private */
    public void setDateOfSave(long j) {
        this.dateOfSave_ = j;
    }

    /* access modifiers changed from: private */
    public void setEmail(String str) {
        str.getClass();
        this.email_ = str;
    }

    /* access modifiers changed from: private */
    public void setEmailBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.email_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setFirstName(String str) {
        str.getClass();
        this.firstName_ = str;
    }

    /* access modifiers changed from: private */
    public void setFirstNameBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.firstName_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setLastModification(String str) {
        str.getClass();
        this.lastModification_ = str;
    }

    /* access modifiers changed from: private */
    public void setLastModificationBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.lastModification_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setLastName(String str) {
        str.getClass();
        this.lastName_ = str;
    }

    /* access modifiers changed from: private */
    public void setLastNameBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.lastName_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setPhones(int i, UserPhone userPhone) {
        userPhone.getClass();
        ensurePhonesIsMutable();
        this.phones_.set(i, userPhone);
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C13136a.f32257a[methodToInvoke.ordinal()]) {
            case 1:
                return new UserInfo();
            case 2:
                return new C13137b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\f\f\u0000\u0004\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007\u0002\bȈ\t\u001b\n\u001b\u000b\u001b\f\u001b", new Object[]{"email_", "firstName_", "lastName_", "birthDate_", "civility_", "cgu_", "dateOfSave_", "lastModification_", "addresses_", UserAddress.class, "cards_", UserCard.class, "phones_", UserPhone.class, "consents_", UserConsent.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<UserInfo> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (UserInfo.class) {
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

    public UserAddress getAddresses(int i) {
        return this.addresses_.get(i);
    }

    public int getAddressesCount() {
        return this.addresses_.size();
    }

    public List<UserAddress> getAddressesList() {
        return this.addresses_;
    }

    public C14072t0 getAddressesOrBuilder(int i) {
        return this.addresses_.get(i);
    }

    public List<? extends C14072t0> getAddressesOrBuilderList() {
        return this.addresses_;
    }

    public String getBirthDate() {
        return this.birthDate_;
    }

    public ByteString getBirthDateBytes() {
        return ByteString.m137260e0(this.birthDate_);
    }

    public UserCard getCards(int i) {
        return this.cards_.get(i);
    }

    public int getCardsCount() {
        return this.cards_.size();
    }

    public List<UserCard> getCardsList() {
        return this.cards_;
    }

    public C14076v0 getCardsOrBuilder(int i) {
        return this.cards_.get(i);
    }

    public List<? extends C14076v0> getCardsOrBuilderList() {
        return this.cards_;
    }

    public String getCgu() {
        return this.cgu_;
    }

    public ByteString getCguBytes() {
        return ByteString.m137260e0(this.cgu_);
    }

    public String getCivility() {
        return this.civility_;
    }

    public ByteString getCivilityBytes() {
        return ByteString.m137260e0(this.civility_);
    }

    public UserConsent getConsents(int i) {
        return this.consents_.get(i);
    }

    public int getConsentsCount() {
        return this.consents_.size();
    }

    public List<UserConsent> getConsentsList() {
        return this.consents_;
    }

    public C14080x0 getConsentsOrBuilder(int i) {
        return this.consents_.get(i);
    }

    public List<? extends C14080x0> getConsentsOrBuilderList() {
        return this.consents_;
    }

    public long getDateOfSave() {
        return this.dateOfSave_;
    }

    public String getEmail() {
        return this.email_;
    }

    public ByteString getEmailBytes() {
        return ByteString.m137260e0(this.email_);
    }

    public String getFirstName() {
        return this.firstName_;
    }

    public ByteString getFirstNameBytes() {
        return ByteString.m137260e0(this.firstName_);
    }

    public String getLastModification() {
        return this.lastModification_;
    }

    public ByteString getLastModificationBytes() {
        return ByteString.m137260e0(this.lastModification_);
    }

    public String getLastName() {
        return this.lastName_;
    }

    public ByteString getLastNameBytes() {
        return ByteString.m137260e0(this.lastName_);
    }

    public UserPhone getPhones(int i) {
        return this.phones_.get(i);
    }

    public int getPhonesCount() {
        return this.phones_.size();
    }

    public List<UserPhone> getPhonesList() {
        return this.phones_;
    }

    public C13843b1 getPhonesOrBuilder(int i) {
        return this.phones_.get(i);
    }

    public List<? extends C13843b1> getPhonesOrBuilderList() {
        return this.phones_;
    }

    public static C13137b newBuilder(UserInfo userInfo) {
        return (C13137b) DEFAULT_INSTANCE.createBuilder(userInfo);
    }

    public static UserInfo parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (UserInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static UserInfo parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (UserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static UserInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (UserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* access modifiers changed from: private */
    public void addAddresses(int i, UserAddress userAddress) {
        userAddress.getClass();
        ensureAddressesIsMutable();
        this.addresses_.add(i, userAddress);
    }

    /* access modifiers changed from: private */
    public void addCards(int i, UserCard userCard) {
        userCard.getClass();
        ensureCardsIsMutable();
        this.cards_.add(i, userCard);
    }

    /* access modifiers changed from: private */
    public void addConsents(int i, UserConsent userConsent) {
        userConsent.getClass();
        ensureConsentsIsMutable();
        this.consents_.add(i, userConsent);
    }

    /* access modifiers changed from: private */
    public void addPhones(int i, UserPhone userPhone) {
        userPhone.getClass();
        ensurePhonesIsMutable();
        this.phones_.add(i, userPhone);
    }

    public static UserInfo parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (UserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static UserInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (UserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UserInfo parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (UserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static UserInfo parseFrom(InputStream inputStream) throws IOException {
        return (UserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserInfo parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (UserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static UserInfo parseFrom(C34448s sVar) throws IOException {
        return (UserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static UserInfo parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (UserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
