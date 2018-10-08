package com.tersesystems.securitybuilder;

import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Cipher;
import org.junit.jupiter.api.Test;
import org.slieb.throwables.SupplierWithThrowable;

public class CipherBuilderTest {

  @Test
  public void testCipher() throws GeneralSecurityException {
    // calls getInstance and then inits the cipher.
    Key key = null;
    Cipher cipher = CipherBuilder.builder().withTransformation("AES/CBC/PKCS5Padding").withEncrypt(key).build();
  }

}