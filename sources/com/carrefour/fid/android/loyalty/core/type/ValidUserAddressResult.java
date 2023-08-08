package com.carrefour.fid.android.loyalty.core.type;

import kotlin.C11076d0;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/core/type/ValidUserAddressResult;", "", "AddressVerification", "Error", "Uninitialized", "ValidAddress", "Lcom/carrefour/fid/android/loyalty/core/type/ValidUserAddressResult$AddressVerification;", "Lcom/carrefour/fid/android/loyalty/core/type/ValidUserAddressResult$Error;", "Lcom/carrefour/fid/android/loyalty/core/type/ValidUserAddressResult$Uninitialized;", "Lcom/carrefour/fid/android/loyalty/core/type/ValidUserAddressResult$ValidAddress;", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public interface ValidUserAddressResult {

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/core/type/ValidUserAddressResult$AddressVerification;", "Lcom/carrefour/fid/android/loyalty/core/type/ValidUserAddressResult;", "()V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class AddressVerification implements ValidUserAddressResult {
        @C12579k
        public static final AddressVerification INSTANCE = new AddressVerification();

        private AddressVerification() {
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/core/type/ValidUserAddressResult$Error;", "Lcom/carrefour/fid/android/loyalty/core/type/ValidUserAddressResult;", "()V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class Error implements ValidUserAddressResult {
        @C12579k
        public static final Error INSTANCE = new Error();

        private Error() {
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/core/type/ValidUserAddressResult$Uninitialized;", "Lcom/carrefour/fid/android/loyalty/core/type/ValidUserAddressResult;", "()V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class Uninitialized implements ValidUserAddressResult {
        @C12579k
        public static final Uninitialized INSTANCE = new Uninitialized();

        private Uninitialized() {
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/core/type/ValidUserAddressResult$ValidAddress;", "Lcom/carrefour/fid/android/loyalty/core/type/ValidUserAddressResult;", "()V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class ValidAddress implements ValidUserAddressResult {
        @C12579k
        public static final ValidAddress INSTANCE = new ValidAddress();

        private ValidAddress() {
        }
    }
}
