package com.carrefour.fid.android;

import com.google.protobuf.ByteString;
import com.google.protobuf.C34319a;
import com.google.protobuf.C34368g0;
import com.google.protobuf.C34448s;
import com.google.protobuf.C34504y1;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class UserAddress extends GeneratedMessageLite<UserAddress, C13131b> implements C14072t0 {
    public static final int ADDRESS1_FIELD_NUMBER = 3;
    public static final int ADDRESS2_FIELD_NUMBER = 4;
    public static final int ADDRESS3_FIELD_NUMBER = 5;
    public static final int ADDRESSNAME_FIELD_NUMBER = 17;
    public static final int APPROXIMATEADDRESS_FIELD_NUMBER = 20;
    public static final int BUILDING_FIELD_NUMBER = 12;
    public static final int CATEGORY_FIELD_NUMBER = 10;
    public static final int CITY_FIELD_NUMBER = 2;
    public static final int COUNTRY_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final UserAddress DEFAULT_INSTANCE;
    public static final int DIGITALCODE_FIELD_NUMBER = 13;
    public static final int FLOOR_FIELD_NUMBER = 15;
    public static final int INFORMATION_FIELD_NUMBER = 16;
    public static final int INTERPHONE_FIELD_NUMBER = 14;
    public static final int KEY_FIELD_NUMBER = 11;
    public static final int LATITUDE_FIELD_NUMBER = 19;
    public static final int LIFT_FIELD_NUMBER = 9;
    public static final int LONGITUDE_FIELD_NUMBER = 18;
    private static volatile C34504y1<UserAddress> PARSER = null;
    public static final int POSTALCODE_FIELD_NUMBER = 8;
    public static final int POSTCODE_FIELD_NUMBER = 7;
    public static final int PREFERENCE_FIELD_NUMBER = 6;
    private String address1_ = "";
    private String address2_ = "";
    private String address3_ = "";
    private String addressName_ = "";
    private boolean approximateAddress_;
    private String building_ = "";
    private String category_ = "";
    private String city_ = "";
    private String country_ = "";
    private String digitalCode_ = "";
    private String floor_ = "";
    private String information_ = "";
    private String interphone_ = "";
    private int key_;
    private double latitude_;
    private boolean lift_;
    private double longitude_;
    private String postalCode_ = "";
    private String postcode_ = "";
    private boolean preference_;

    /* renamed from: com.carrefour.fid.android.UserAddress$a */
    public static /* synthetic */ class C13130a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32254a;

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
                f32254a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f32254a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f32254a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f32254a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f32254a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f32254a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f32254a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.UserAddress.C13130a.<clinit>():void");
        }
    }

    /* renamed from: com.carrefour.fid.android.UserAddress$b */
    public static final class C13131b extends GeneratedMessageLite.C34263b<UserAddress, C13131b> implements C14072t0 {
        /* renamed from: B0 */
        public C13131b mo30931B0(String str) {
            mo100457F();
            ((UserAddress) this.f83053b).setBuilding(str);
            return this;
        }

        /* renamed from: D0 */
        public C13131b mo30932D0(ByteString byteString) {
            mo100457F();
            ((UserAddress) this.f83053b).setBuildingBytes(byteString);
            return this;
        }

        /* renamed from: E0 */
        public C13131b mo30933E0(String str) {
            mo100457F();
            ((UserAddress) this.f83053b).setCategory(str);
            return this;
        }

        /* renamed from: F0 */
        public C13131b mo30934F0(ByteString byteString) {
            mo100457F();
            ((UserAddress) this.f83053b).setCategoryBytes(byteString);
            return this;
        }

        /* renamed from: G0 */
        public C13131b mo30935G0(String str) {
            mo100457F();
            ((UserAddress) this.f83053b).setCity(str);
            return this;
        }

        /* renamed from: H0 */
        public C13131b mo30936H0(ByteString byteString) {
            mo100457F();
            ((UserAddress) this.f83053b).setCityBytes(byteString);
            return this;
        }

        /* renamed from: I0 */
        public C13131b mo30937I0(String str) {
            mo100457F();
            ((UserAddress) this.f83053b).setCountry(str);
            return this;
        }

        /* renamed from: J0 */
        public C13131b mo30938J0(ByteString byteString) {
            mo100457F();
            ((UserAddress) this.f83053b).setCountryBytes(byteString);
            return this;
        }

        /* renamed from: L0 */
        public C13131b mo30939L0(String str) {
            mo100457F();
            ((UserAddress) this.f83053b).setDigitalCode(str);
            return this;
        }

        /* renamed from: M0 */
        public C13131b mo30940M0(ByteString byteString) {
            mo100457F();
            ((UserAddress) this.f83053b).setDigitalCodeBytes(byteString);
            return this;
        }

        /* renamed from: O0 */
        public C13131b mo30941O0(String str) {
            mo100457F();
            ((UserAddress) this.f83053b).setFloor(str);
            return this;
        }

        /* renamed from: P */
        public C13131b mo30942P() {
            mo100457F();
            ((UserAddress) this.f83053b).clearAddress1();
            return this;
        }

        /* renamed from: P0 */
        public C13131b mo30943P0(ByteString byteString) {
            mo100457F();
            ((UserAddress) this.f83053b).setFloorBytes(byteString);
            return this;
        }

        /* renamed from: Q0 */
        public C13131b mo30944Q0(String str) {
            mo100457F();
            ((UserAddress) this.f83053b).setInformation(str);
            return this;
        }

        /* renamed from: R */
        public C13131b mo30945R() {
            mo100457F();
            ((UserAddress) this.f83053b).clearAddress2();
            return this;
        }

        /* renamed from: R0 */
        public C13131b mo30946R0(ByteString byteString) {
            mo100457F();
            ((UserAddress) this.f83053b).setInformationBytes(byteString);
            return this;
        }

        /* renamed from: S */
        public C13131b mo30947S() {
            mo100457F();
            ((UserAddress) this.f83053b).clearAddress3();
            return this;
        }

        /* renamed from: S0 */
        public C13131b mo30948S0(String str) {
            mo100457F();
            ((UserAddress) this.f83053b).setInterphone(str);
            return this;
        }

        /* renamed from: T */
        public C13131b mo30949T() {
            mo100457F();
            ((UserAddress) this.f83053b).clearAddressName();
            return this;
        }

        /* renamed from: T0 */
        public C13131b mo30950T0(ByteString byteString) {
            mo100457F();
            ((UserAddress) this.f83053b).setInterphoneBytes(byteString);
            return this;
        }

        /* renamed from: U */
        public C13131b mo30951U() {
            mo100457F();
            ((UserAddress) this.f83053b).clearApproximateAddress();
            return this;
        }

        /* renamed from: U0 */
        public C13131b mo30952U0(int i) {
            mo100457F();
            ((UserAddress) this.f83053b).setKey(i);
            return this;
        }

        /* renamed from: V */
        public C13131b mo30953V() {
            mo100457F();
            ((UserAddress) this.f83053b).clearBuilding();
            return this;
        }

        /* renamed from: V0 */
        public C13131b mo30954V0(double d) {
            mo100457F();
            ((UserAddress) this.f83053b).setLatitude(d);
            return this;
        }

        /* renamed from: W0 */
        public C13131b mo30955W0(boolean z) {
            mo100457F();
            ((UserAddress) this.f83053b).setLift(z);
            return this;
        }

        /* renamed from: X0 */
        public C13131b mo30956X0(double d) {
            mo100457F();
            ((UserAddress) this.f83053b).setLongitude(d);
            return this;
        }

        /* renamed from: Y */
        public C13131b mo30957Y() {
            mo100457F();
            ((UserAddress) this.f83053b).clearCategory();
            return this;
        }

        @Deprecated
        /* renamed from: Y0 */
        public C13131b mo30958Y0(String str) {
            mo100457F();
            ((UserAddress) this.f83053b).setPostalCode(str);
            return this;
        }

        /* renamed from: Z */
        public C13131b mo30959Z() {
            mo100457F();
            ((UserAddress) this.f83053b).clearCity();
            return this;
        }

        @Deprecated
        /* renamed from: Z0 */
        public C13131b mo30960Z0(ByteString byteString) {
            mo100457F();
            ((UserAddress) this.f83053b).setPostalCodeBytes(byteString);
            return this;
        }

        /* renamed from: a0 */
        public C13131b mo30961a0() {
            mo100457F();
            ((UserAddress) this.f83053b).clearCountry();
            return this;
        }

        /* renamed from: a1 */
        public C13131b mo30962a1(String str) {
            mo100457F();
            ((UserAddress) this.f83053b).setPostcode(str);
            return this;
        }

        /* renamed from: b0 */
        public C13131b mo30963b0() {
            mo100457F();
            ((UserAddress) this.f83053b).clearDigitalCode();
            return this;
        }

        /* renamed from: b1 */
        public C13131b mo30964b1(ByteString byteString) {
            mo100457F();
            ((UserAddress) this.f83053b).setPostcodeBytes(byteString);
            return this;
        }

        /* renamed from: c0 */
        public C13131b mo30965c0() {
            mo100457F();
            ((UserAddress) this.f83053b).clearFloor();
            return this;
        }

        /* renamed from: c1 */
        public C13131b mo30966c1(boolean z) {
            mo100457F();
            ((UserAddress) this.f83053b).setPreference(z);
            return this;
        }

        /* renamed from: d0 */
        public C13131b mo30967d0() {
            mo100457F();
            ((UserAddress) this.f83053b).clearInformation();
            return this;
        }

        /* renamed from: g0 */
        public C13131b mo30968g0() {
            mo100457F();
            ((UserAddress) this.f83053b).clearInterphone();
            return this;
        }

        public String getAddress1() {
            return ((UserAddress) this.f83053b).getAddress1();
        }

        public ByteString getAddress1Bytes() {
            return ((UserAddress) this.f83053b).getAddress1Bytes();
        }

        public String getAddress2() {
            return ((UserAddress) this.f83053b).getAddress2();
        }

        public ByteString getAddress2Bytes() {
            return ((UserAddress) this.f83053b).getAddress2Bytes();
        }

        public String getAddress3() {
            return ((UserAddress) this.f83053b).getAddress3();
        }

        public ByteString getAddress3Bytes() {
            return ((UserAddress) this.f83053b).getAddress3Bytes();
        }

        public String getAddressName() {
            return ((UserAddress) this.f83053b).getAddressName();
        }

        public ByteString getAddressNameBytes() {
            return ((UserAddress) this.f83053b).getAddressNameBytes();
        }

        public boolean getApproximateAddress() {
            return ((UserAddress) this.f83053b).getApproximateAddress();
        }

        public String getBuilding() {
            return ((UserAddress) this.f83053b).getBuilding();
        }

        public ByteString getBuildingBytes() {
            return ((UserAddress) this.f83053b).getBuildingBytes();
        }

        public String getCategory() {
            return ((UserAddress) this.f83053b).getCategory();
        }

        public ByteString getCategoryBytes() {
            return ((UserAddress) this.f83053b).getCategoryBytes();
        }

        public String getCity() {
            return ((UserAddress) this.f83053b).getCity();
        }

        public ByteString getCityBytes() {
            return ((UserAddress) this.f83053b).getCityBytes();
        }

        public String getCountry() {
            return ((UserAddress) this.f83053b).getCountry();
        }

        public ByteString getCountryBytes() {
            return ((UserAddress) this.f83053b).getCountryBytes();
        }

        public String getDigitalCode() {
            return ((UserAddress) this.f83053b).getDigitalCode();
        }

        public ByteString getDigitalCodeBytes() {
            return ((UserAddress) this.f83053b).getDigitalCodeBytes();
        }

        public String getFloor() {
            return ((UserAddress) this.f83053b).getFloor();
        }

        public ByteString getFloorBytes() {
            return ((UserAddress) this.f83053b).getFloorBytes();
        }

        public String getInformation() {
            return ((UserAddress) this.f83053b).getInformation();
        }

        public ByteString getInformationBytes() {
            return ((UserAddress) this.f83053b).getInformationBytes();
        }

        public String getInterphone() {
            return ((UserAddress) this.f83053b).getInterphone();
        }

        public ByteString getInterphoneBytes() {
            return ((UserAddress) this.f83053b).getInterphoneBytes();
        }

        public int getKey() {
            return ((UserAddress) this.f83053b).getKey();
        }

        public double getLatitude() {
            return ((UserAddress) this.f83053b).getLatitude();
        }

        public boolean getLift() {
            return ((UserAddress) this.f83053b).getLift();
        }

        public double getLongitude() {
            return ((UserAddress) this.f83053b).getLongitude();
        }

        @Deprecated
        public String getPostalCode() {
            return ((UserAddress) this.f83053b).getPostalCode();
        }

        @Deprecated
        public ByteString getPostalCodeBytes() {
            return ((UserAddress) this.f83053b).getPostalCodeBytes();
        }

        public String getPostcode() {
            return ((UserAddress) this.f83053b).getPostcode();
        }

        public ByteString getPostcodeBytes() {
            return ((UserAddress) this.f83053b).getPostcodeBytes();
        }

        public boolean getPreference() {
            return ((UserAddress) this.f83053b).getPreference();
        }

        /* renamed from: h0 */
        public C13131b mo30969h0() {
            mo100457F();
            ((UserAddress) this.f83053b).clearKey();
            return this;
        }

        /* renamed from: i0 */
        public C13131b mo30970i0() {
            mo100457F();
            ((UserAddress) this.f83053b).clearLatitude();
            return this;
        }

        /* renamed from: j0 */
        public C13131b mo30971j0() {
            mo100457F();
            ((UserAddress) this.f83053b).clearLift();
            return this;
        }

        /* renamed from: k0 */
        public C13131b mo30972k0() {
            mo100457F();
            ((UserAddress) this.f83053b).clearLongitude();
            return this;
        }

        @Deprecated
        /* renamed from: l0 */
        public C13131b mo30973l0() {
            mo100457F();
            ((UserAddress) this.f83053b).clearPostalCode();
            return this;
        }

        /* renamed from: m0 */
        public C13131b mo30974m0() {
            mo100457F();
            ((UserAddress) this.f83053b).clearPostcode();
            return this;
        }

        /* renamed from: o0 */
        public C13131b mo30975o0() {
            mo100457F();
            ((UserAddress) this.f83053b).clearPreference();
            return this;
        }

        /* renamed from: q0 */
        public C13131b mo30976q0(String str) {
            mo100457F();
            ((UserAddress) this.f83053b).setAddress1(str);
            return this;
        }

        /* renamed from: r0 */
        public C13131b mo30977r0(ByteString byteString) {
            mo100457F();
            ((UserAddress) this.f83053b).setAddress1Bytes(byteString);
            return this;
        }

        /* renamed from: s0 */
        public C13131b mo30978s0(String str) {
            mo100457F();
            ((UserAddress) this.f83053b).setAddress2(str);
            return this;
        }

        /* renamed from: u0 */
        public C13131b mo30979u0(ByteString byteString) {
            mo100457F();
            ((UserAddress) this.f83053b).setAddress2Bytes(byteString);
            return this;
        }

        /* renamed from: v0 */
        public C13131b mo30980v0(String str) {
            mo100457F();
            ((UserAddress) this.f83053b).setAddress3(str);
            return this;
        }

        /* renamed from: w0 */
        public C13131b mo30981w0(ByteString byteString) {
            mo100457F();
            ((UserAddress) this.f83053b).setAddress3Bytes(byteString);
            return this;
        }

        /* renamed from: x0 */
        public C13131b mo30982x0(String str) {
            mo100457F();
            ((UserAddress) this.f83053b).setAddressName(str);
            return this;
        }

        /* renamed from: y0 */
        public C13131b mo30983y0(ByteString byteString) {
            mo100457F();
            ((UserAddress) this.f83053b).setAddressNameBytes(byteString);
            return this;
        }

        /* renamed from: z0 */
        public C13131b mo30984z0(boolean z) {
            mo100457F();
            ((UserAddress) this.f83053b).setApproximateAddress(z);
            return this;
        }

        public C13131b() {
            super(UserAddress.DEFAULT_INSTANCE);
        }
    }

    static {
        UserAddress userAddress = new UserAddress();
        DEFAULT_INSTANCE = userAddress;
        GeneratedMessageLite.registerDefaultInstance(UserAddress.class, userAddress);
    }

    private UserAddress() {
    }

    /* access modifiers changed from: private */
    public void clearAddress1() {
        this.address1_ = getDefaultInstance().getAddress1();
    }

    /* access modifiers changed from: private */
    public void clearAddress2() {
        this.address2_ = getDefaultInstance().getAddress2();
    }

    /* access modifiers changed from: private */
    public void clearAddress3() {
        this.address3_ = getDefaultInstance().getAddress3();
    }

    /* access modifiers changed from: private */
    public void clearAddressName() {
        this.addressName_ = getDefaultInstance().getAddressName();
    }

    /* access modifiers changed from: private */
    public void clearApproximateAddress() {
        this.approximateAddress_ = false;
    }

    /* access modifiers changed from: private */
    public void clearBuilding() {
        this.building_ = getDefaultInstance().getBuilding();
    }

    /* access modifiers changed from: private */
    public void clearCategory() {
        this.category_ = getDefaultInstance().getCategory();
    }

    /* access modifiers changed from: private */
    public void clearCity() {
        this.city_ = getDefaultInstance().getCity();
    }

    /* access modifiers changed from: private */
    public void clearCountry() {
        this.country_ = getDefaultInstance().getCountry();
    }

    /* access modifiers changed from: private */
    public void clearDigitalCode() {
        this.digitalCode_ = getDefaultInstance().getDigitalCode();
    }

    /* access modifiers changed from: private */
    public void clearFloor() {
        this.floor_ = getDefaultInstance().getFloor();
    }

    /* access modifiers changed from: private */
    public void clearInformation() {
        this.information_ = getDefaultInstance().getInformation();
    }

    /* access modifiers changed from: private */
    public void clearInterphone() {
        this.interphone_ = getDefaultInstance().getInterphone();
    }

    /* access modifiers changed from: private */
    public void clearKey() {
        this.key_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearLatitude() {
        this.latitude_ = 0.0d;
    }

    /* access modifiers changed from: private */
    public void clearLift() {
        this.lift_ = false;
    }

    /* access modifiers changed from: private */
    public void clearLongitude() {
        this.longitude_ = 0.0d;
    }

    /* access modifiers changed from: private */
    public void clearPostalCode() {
        this.postalCode_ = getDefaultInstance().getPostalCode();
    }

    /* access modifiers changed from: private */
    public void clearPostcode() {
        this.postcode_ = getDefaultInstance().getPostcode();
    }

    /* access modifiers changed from: private */
    public void clearPreference() {
        this.preference_ = false;
    }

    public static UserAddress getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C13131b newBuilder() {
        return (C13131b) DEFAULT_INSTANCE.createBuilder();
    }

    public static UserAddress parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UserAddress) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserAddress parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UserAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<UserAddress> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setAddress1(String str) {
        str.getClass();
        this.address1_ = str;
    }

    /* access modifiers changed from: private */
    public void setAddress1Bytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.address1_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setAddress2(String str) {
        str.getClass();
        this.address2_ = str;
    }

    /* access modifiers changed from: private */
    public void setAddress2Bytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.address2_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setAddress3(String str) {
        str.getClass();
        this.address3_ = str;
    }

    /* access modifiers changed from: private */
    public void setAddress3Bytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.address3_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setAddressName(String str) {
        str.getClass();
        this.addressName_ = str;
    }

    /* access modifiers changed from: private */
    public void setAddressNameBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.addressName_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setApproximateAddress(boolean z) {
        this.approximateAddress_ = z;
    }

    /* access modifiers changed from: private */
    public void setBuilding(String str) {
        str.getClass();
        this.building_ = str;
    }

    /* access modifiers changed from: private */
    public void setBuildingBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.building_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setCategory(String str) {
        str.getClass();
        this.category_ = str;
    }

    /* access modifiers changed from: private */
    public void setCategoryBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.category_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setCity(String str) {
        str.getClass();
        this.city_ = str;
    }

    /* access modifiers changed from: private */
    public void setCityBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.city_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setCountry(String str) {
        str.getClass();
        this.country_ = str;
    }

    /* access modifiers changed from: private */
    public void setCountryBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.country_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setDigitalCode(String str) {
        str.getClass();
        this.digitalCode_ = str;
    }

    /* access modifiers changed from: private */
    public void setDigitalCodeBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.digitalCode_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setFloor(String str) {
        str.getClass();
        this.floor_ = str;
    }

    /* access modifiers changed from: private */
    public void setFloorBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.floor_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setInformation(String str) {
        str.getClass();
        this.information_ = str;
    }

    /* access modifiers changed from: private */
    public void setInformationBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.information_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setInterphone(String str) {
        str.getClass();
        this.interphone_ = str;
    }

    /* access modifiers changed from: private */
    public void setInterphoneBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.interphone_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setKey(int i) {
        this.key_ = i;
    }

    /* access modifiers changed from: private */
    public void setLatitude(double d) {
        this.latitude_ = d;
    }

    /* access modifiers changed from: private */
    public void setLift(boolean z) {
        this.lift_ = z;
    }

    /* access modifiers changed from: private */
    public void setLongitude(double d) {
        this.longitude_ = d;
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
    public void setPostcode(String str) {
        str.getClass();
        this.postcode_ = str;
    }

    /* access modifiers changed from: private */
    public void setPostcodeBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.postcode_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setPreference(boolean z) {
        this.preference_ = z;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C13130a.f32254a[methodToInvoke.ordinal()]) {
            case 1:
                return new UserAddress();
            case 2:
                return new C13131b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0014\u0000\u0000\u0001\u0014\u0014\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u0007\u0007Ȉ\bȈ\t\u0007\nȈ\u000b\u0004\fȈ\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012\u0000\u0013\u0000\u0014\u0007", new Object[]{"country_", "city_", "address1_", "address2_", "address3_", "preference_", "postcode_", "postalCode_", "lift_", "category_", "key_", "building_", "digitalCode_", "interphone_", "floor_", "information_", "addressName_", "longitude_", "latitude_", "approximateAddress_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<UserAddress> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (UserAddress.class) {
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

    public String getAddress1() {
        return this.address1_;
    }

    public ByteString getAddress1Bytes() {
        return ByteString.m137260e0(this.address1_);
    }

    public String getAddress2() {
        return this.address2_;
    }

    public ByteString getAddress2Bytes() {
        return ByteString.m137260e0(this.address2_);
    }

    public String getAddress3() {
        return this.address3_;
    }

    public ByteString getAddress3Bytes() {
        return ByteString.m137260e0(this.address3_);
    }

    public String getAddressName() {
        return this.addressName_;
    }

    public ByteString getAddressNameBytes() {
        return ByteString.m137260e0(this.addressName_);
    }

    public boolean getApproximateAddress() {
        return this.approximateAddress_;
    }

    public String getBuilding() {
        return this.building_;
    }

    public ByteString getBuildingBytes() {
        return ByteString.m137260e0(this.building_);
    }

    public String getCategory() {
        return this.category_;
    }

    public ByteString getCategoryBytes() {
        return ByteString.m137260e0(this.category_);
    }

    public String getCity() {
        return this.city_;
    }

    public ByteString getCityBytes() {
        return ByteString.m137260e0(this.city_);
    }

    public String getCountry() {
        return this.country_;
    }

    public ByteString getCountryBytes() {
        return ByteString.m137260e0(this.country_);
    }

    public String getDigitalCode() {
        return this.digitalCode_;
    }

    public ByteString getDigitalCodeBytes() {
        return ByteString.m137260e0(this.digitalCode_);
    }

    public String getFloor() {
        return this.floor_;
    }

    public ByteString getFloorBytes() {
        return ByteString.m137260e0(this.floor_);
    }

    public String getInformation() {
        return this.information_;
    }

    public ByteString getInformationBytes() {
        return ByteString.m137260e0(this.information_);
    }

    public String getInterphone() {
        return this.interphone_;
    }

    public ByteString getInterphoneBytes() {
        return ByteString.m137260e0(this.interphone_);
    }

    public int getKey() {
        return this.key_;
    }

    public double getLatitude() {
        return this.latitude_;
    }

    public boolean getLift() {
        return this.lift_;
    }

    public double getLongitude() {
        return this.longitude_;
    }

    @Deprecated
    public String getPostalCode() {
        return this.postalCode_;
    }

    @Deprecated
    public ByteString getPostalCodeBytes() {
        return ByteString.m137260e0(this.postalCode_);
    }

    public String getPostcode() {
        return this.postcode_;
    }

    public ByteString getPostcodeBytes() {
        return ByteString.m137260e0(this.postcode_);
    }

    public boolean getPreference() {
        return this.preference_;
    }

    public static C13131b newBuilder(UserAddress userAddress) {
        return (C13131b) DEFAULT_INSTANCE.createBuilder(userAddress);
    }

    public static UserAddress parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (UserAddress) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static UserAddress parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (UserAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static UserAddress parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (UserAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static UserAddress parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (UserAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static UserAddress parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (UserAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UserAddress parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (UserAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static UserAddress parseFrom(InputStream inputStream) throws IOException {
        return (UserAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserAddress parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (UserAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static UserAddress parseFrom(C34448s sVar) throws IOException {
        return (UserAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static UserAddress parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (UserAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
