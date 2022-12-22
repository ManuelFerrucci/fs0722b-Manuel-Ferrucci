document.addEventListener('DOMContentLoaded', function () {
    var splide = new Splide('.splide', {
        perPage: 1,
        gap: '1rem',
        autoplay: true
    });
    splide.mount();
});