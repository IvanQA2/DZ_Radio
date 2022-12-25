package ru.netology;

public class Radio {
    private int radioStationNumber = 0;
    private int radioSoundVolume;
    private final int maxStation;

    public Radio(){
        maxStation = 9;

    }

    public Radio (int stationsCount){
        maxStation = stationsCount -1;

    }

    public void next() {
        if (radioStationNumber == maxStation) {
            radioStationNumber = 0;
        }
        else {
            radioStationNumber++;
        }
    }
    public void prev(){
        if (radioStationNumber == 0) {
            radioStationNumber = maxStation;
        }else{
            radioStationNumber--;
        }
    }

    public void nextVolume() {
        if (radioSoundVolume == 100) {
            return;
        }else{
            radioSoundVolume++;
        }
    }
    public void prevVolume(){
        if (radioSoundVolume == 0) {
            return;
        }else{
            radioSoundVolume--;
        }
    }

    public int getRadioStationNumber(){

        return radioStationNumber;
    }
    public void setRadioStationNumber(int radioStationNumber){
        if (radioStationNumber < 0) {
            return;
        }
        if (radioStationNumber > maxStation) {
            return;
        }
        this.radioStationNumber = radioStationNumber;
    }

    public int getRadioSoundVolume(){

        return radioSoundVolume;
    }

    public void setRadioSoundVolume(int radioSoundVolume){
        if (radioSoundVolume <0) {
            return;
        }
        if (radioSoundVolume > 100) {
            return;
        }
        this.radioSoundVolume = radioSoundVolume;
    }

}
