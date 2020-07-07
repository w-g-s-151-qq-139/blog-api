package com.wgs.blog;

import com.wgs.blog.config.JwtConfig;
import com.wgs.blog.utils.Md5Utils;
import io.jsonwebtoken.Claims;
import org.assertj.core.util.DateUtil;

import java.util.*;

public class TestList {
    public static void main(String[] args) {

        JwtConfig jwtConfig = new JwtConfig();
        String token = jwtConfig.createToken("11111", 60);
        Claims tokenClaim = jwtConfig.getTokenClaim(token);
        boolean empty = tokenClaim.isEmpty();
        System.out.println(token);
    }

    public static int[] corpFlightBookings(int[][] bookings, int n) {

        int[] counters = new int[n];
        for (int[] booking : bookings) {
            counters[booking[0] - 1] += booking[2];
            if (booking[1] < n) {
                counters[booking[1]] -= booking[2];
            }
        }
        for (int i = 1; i < n; ++i) {
            counters[i] += counters[i - 1];
        }
        return counters;

    }
}
