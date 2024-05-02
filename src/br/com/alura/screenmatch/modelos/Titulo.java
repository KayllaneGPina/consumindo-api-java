package br.com.alura.screenmatch.modelos;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{

    @SerializedName("Title")
    private String name;
    @SerializedName("Year")
    private int releaseDate;
    private int runningTime;
    private boolean includedInPlan;
    private double ratingSum;
    private int totalRatings;


    public Titulo(String name, int releaseDate) {
        this.name = name;
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public boolean isIncludedInPlan() {
        return includedInPlan;
    }

    public double getRatingSum() {
        return ratingSum;
    }

    public int getRunningTime() {
        return runningTime;
    }

    public int getTotalRatings() {
        return totalRatings;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIncludedInPlan(boolean includedInPlan) {
        this.includedInPlan = includedInPlan;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setRunningTime(int runningTime) {
        this.runningTime = runningTime;
    }

    public void displayTechnicalSheet() {
        System.out.println("Movie's name: " + name);
        System.out.println("Release date: " + releaseDate);
        System.out.println("Running time: " + runningTime);
        System.out.println("Included in the plan?: " + includedInPlan);
        System.out.println("Rating: " + ratingSum);
        System.out.println("Total ratings: " + totalRatings);
    }

    public void rate(double note) {
        ratingSum += note;
        totalRatings++;
    }

    public double getRatingAverage() {
        return ratingSum / totalRatings;
    }

    //Trabalhando com comparable (Interface) - Aula sobre Ordenação de listas
    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getName().compareTo(outroTitulo.getName());
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", releaseDate=" + releaseDate;
    }
}
