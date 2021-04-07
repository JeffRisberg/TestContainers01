package com.company;


public class RedisBackedCacheIntTestStep0 {
  private RedisBackedCache underTest;

  @Before
  public void setUp() {
    // Assume that we have Redis running locally?
    underTest = new RedisBackedCache("localhost", 6379);
  }

  @Test
  public void testSimplePutAndGet() {
    underTest.put("test", "example");

    String retrieved = underTest.get("test");
    assertEquals("example", retrieved);
  }
}
