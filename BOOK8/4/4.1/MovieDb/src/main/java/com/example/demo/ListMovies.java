package com.example.demo;

import java.sql.*;
import java.text.NumberFormat;

public class ListMovies {
    public static void main(String[] args) {
        NumberFormat cf = NumberFormat.getCurrencyInstance();

        insertMovies();

        ResultSet movies = getMovies();
        try {
            while (movies.next()) {
                Movie m = getMovie(movies);

                String msg = Integer.toString(m.year);
                msg += ": " + m.title;
                msg += " (" + cf.format(m.price) + ")";

                System.out.println(msg);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void insertMovies() {
        Connection con = getConnection();
        try {
            Statement s = con.createStatement();

            String movie1 = generateRandomMovie();
            String movie2 = generateRandomMovie();
            int year1 = generateRandomYear();
            int year2 = generateRandomYear();
            double price1 = generateRandomPrice();
            double price2 = generateRandomPrice();

            String insert1 = "INSERT INTO movie (title, year, price) VALUES ('" + movie1 + "', " + year1 + ", " + price1 + ")";
            String insert2 = "INSERT INTO movie (title, year, price) VALUES ('" + movie2 + "', " + year2 + ", " + price2 + ")";
            s.executeUpdate(insert1);
            s.executeUpdate(insert2);

            System.out.println("Two new movies inserted into the database.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private static ResultSet getMovies() {
        Connection con = getConnection();
        try {
            Statement s = con.createStatement();
            String select = "SELECT title, year, price " + "FROM movie ORDER BY year";
            ResultSet rows = s.executeQuery(select);
            return rows;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    private static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost/Movies";
            String user = "root";
            String pw = "GHJcD%32@N4m7HqK7";

            con = DriverManager.getConnection(url, user, pw);
        } catch (ClassNotFoundException e) {
            System.out.println(e); 
            System.exit(0);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        return con;
    }

    private static Movie getMovie(ResultSet movies) {
        try {
            String title = movies.getString("title");
            int year = movies.getInt("year");
            double price = movies.getDouble("price");

            return new Movie(title, year, price);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    private static class Movie {
        public String title;
        public int year;
        public double price;

        public Movie(String title, int year, double price) {
            this.title = title;
            this.year = year;
            this.price = price;
        }
    }

    private static String generateRandomMovie() {
        String[] movies = {
                "The Matrix",
                "Inception",
                "Pulp Fiction",
                "The Shawshank Redemption",
                "Fight Club",
        };

        int randomIndex = (int) (Math.random() * movies.length);
        return movies[randomIndex];
    }

    private static int generateRandomYear() {
        int minYear = 2000;
        int maxYear = 2022;

        return minYear + (int) (Math.random() * (maxYear - minYear + 1));
    }

    private static double generateRandomPrice() {
        double minPrice = 10.0;
        double maxPrice = 100.0;

        return minPrice + (Math.random() * (maxPrice - minPrice));
    }
}
