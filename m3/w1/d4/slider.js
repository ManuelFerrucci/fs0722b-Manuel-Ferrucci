document.addEventListener('DOMContentLoaded', function () {
    var splide = new Splide('.splide', {
        type: 'loop',
        perPage: 1,
        gap: '1rem'
    });
    splide.mount();
});