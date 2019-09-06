package com.opencloud.common.utils;

import com.opencloud.common.utils.EncodeUtils;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class EncodeUtilsTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void encodeBase62Input0OutputNotNull3() {

    // Arrange
    final byte[] input = {};

    // Act and Assert result
    Assert.assertEquals("", EncodeUtils.encodeBase62(input));
  }

  // Test written by Diffblue Cover.

  @Test
  public void encodeBase62Input1OutputNotNull() {

    // Arrange
    final byte[] input = {(byte)0};

    // Act
    final String actual = EncodeUtils.encodeBase62(input);

    // Assert result
    Assert.assertEquals("0", actual);
  }
}
