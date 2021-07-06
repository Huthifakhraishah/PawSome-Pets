window.adroll_exp_list = [];

let map;

function initMap() {
  map = new google.maps.Map(document.getElementById("map"), {
    center: { lat: 32.229237 , lng: 35.256047},
    zoom: 18,
  });

  new google.maps.Marker({
    position: { lat: 32.229237 , lng: 35.256047},
    map,
    title: "pawsomepets",
  });
}